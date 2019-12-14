package pl.jaszczomb.appserverside.service.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.service.db.UserService;

import java.util.Optional;

@Service
public class MongoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userService.getUserByEmail(username);

        userOptional.orElseThrow(() -> new UsernameNotFoundException("No such user: " + username));

        return new MongoUserDetails(userOptional.get());
    }
}
