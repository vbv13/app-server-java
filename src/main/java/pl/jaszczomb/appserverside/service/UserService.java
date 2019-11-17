package pl.jaszczomb.appserverside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() { return userRepository.findAll(); }

    public Optional<User> getUser(String _id) { return userRepository.findById(_id); }

    public User saveUser(User user) { return userRepository.save(user); }

    public void deleteUser(String _id) { userRepository.deleteById(_id); }
}
