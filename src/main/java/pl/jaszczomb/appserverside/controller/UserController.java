package pl.jaszczomb.appserverside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jaszczomb.appserverside.dto.UserDto;
import pl.jaszczomb.appserverside.mapper.UserMapper;
import pl.jaszczomb.appserverside.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired private UserService userService;
    @Autowired private UserMapper userMapper;

    @PostMapping
    public void createUser(@RequestBody UserDto userDto) {
        userService.saveUser(userMapper.mapToUser(userDto));
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userMapper.mapToUserDto(userService.saveUser(userMapper.mapToUser(userDto)));
    }
//    @PostMapping
//    public void uploadImage(){
//
//    }
//
//    @PostMapping
//    public void removeImage(){
//
//    }
//
//    @PostMapping
//    public void addToCart() {
//
//    }
//
//    @GetMapping
//    public void removeFromCart() {
//
//    }
//
//    @PostMapping
//    public void successBuy() {
//

//    }
}

