package pl.jaszczomb.appserverside.config.security;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.mapper.UserMapper;
import pl.jaszczomb.appserverside.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
class UserSecurity {

    private String userMail;
    private String password;
    private String role;

    public UserSecurity(User user) {
        userMail = user.getEmail();
        password = user.getPassword();
        role = String.valueOf(user.getRole());
    }
}
