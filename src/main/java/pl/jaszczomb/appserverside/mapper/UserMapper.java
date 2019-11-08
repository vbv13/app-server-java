package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.UserDto;
import pl.jaszczomb.appserverside.collection.User;

@Component
public class UserMapper {

    public UserDto mapToUserDto(User user) {
        return new UserDto();
    }

    public User mapToUser(UserDto userDto) {
        User user = new User();
        return user;
    }
}
