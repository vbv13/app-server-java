package pl.jaszczomb.appserverside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jaszczomb.appserverside.dto.UserDto;
import pl.jaszczomb.appserverside.mapper.UserMapper;
import pl.jaszczomb.appserverside.service.UserService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("users")
public class UserController {

    @Autowired private UserService userService;
    @Autowired private UserMapper userMapper;

    @PostMapping("register")
    public void createUser(@RequestBody UserDto userDto) {
        userService.saveUser(userMapper.mapToUser(userDto));
    }

    @GetMapping
    public List<UserDto> getUsers() {
        return userMapper.mapToUserDtoList(userService.getUsers());
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userMapper.mapToUserDto(userService.saveUser(userMapper.mapToUser(userDto)));
    }
    @PostMapping("uploadimage")
    public void uploadImage(){

    }

    @PostMapping("removeimage")
    public void removeImage(){

    }

    @PostMapping("addToCart")
    public void addToCart() {

    }

    @GetMapping("removeFromCart")
    public void removeFromCart() {

    }

    @PostMapping("successBuy")
    public void successBuy() {


    }
}

