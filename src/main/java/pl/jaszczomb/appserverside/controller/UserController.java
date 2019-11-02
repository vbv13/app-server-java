package pl.jaszczomb.appserverside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.repository.UserRepository;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    UserRepository userRepository;

//    @GetMapping("auth")
//    public boolean authorise(Req req) {
//        return true;
//    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }

//    @PostMapping
//    public boolean loginUser(User user) {
//        return true;
//    }
//
//    @GetMapping
//    public boolean logoutUser(User user) {
//        return true;
//    }
//
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

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}

