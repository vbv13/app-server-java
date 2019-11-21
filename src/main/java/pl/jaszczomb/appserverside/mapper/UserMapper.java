package pl.jaszczomb.appserverside.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private HistoryMapper historyMapper;

    public UserDto mapToUserDto(User user) {
        return new UserDto(user.getId(), cartMapper.mapToCartDtoList(user.getCart()),
                historyMapper.mapToHistoryDtoList(user.getHistory()), user.getRole(), user.getEmail(),
                user.getPassword(), user.getName(), user.getLastname(), user.getToken());
    }

    public User mapToUser(UserDto userDto) {
        return new User(userDto.getId(), cartMapper.mapToCartList(userDto.getCart()),
                historyMapper.mapToHistoryList(userDto.getHistory()), userDto.getRole(), userDto.getEmail(),
                userDto.getPassword(), userDto.getName(), userDto.getLastname(), userDto.getToken());
    }

    public List<UserDto> mapToUserDtoList(List<User> users) {
        return users.stream()
                .map(this::mapToUserDto)
                .collect(Collectors.toList());
    }
}
