package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Sort;
import pl.jaszczomb.appserverside.dto.SortDto;
import pl.jaszczomb.appserverside.dto.UserDto;
import pl.jaszczomb.appserverside.collection.User;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public UserDto mapToUserDto(User user) {
        return new UserDto();
    }

    public User mapToUser(UserDto userDto) {
        User user = new User();
        return user;
    }

    public List<UserDto> mapToUserDtoList(List<User> users) {
        return users.stream()
                .map(this::mapToUserDto)
                .collect(Collectors.toList());
    }
}
