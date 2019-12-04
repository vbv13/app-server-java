package pl.jaszczomb.appserverside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import pl.jaszczomb.appserverside.collection.Payment;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.collection.embedded.History;
import pl.jaszczomb.appserverside.dto.ProductDto;
import pl.jaszczomb.appserverside.dto.UserDto;
import pl.jaszczomb.appserverside.dto.temp.CredentialDto;
import pl.jaszczomb.appserverside.mapper.ImageMapper;
import pl.jaszczomb.appserverside.mapper.ProductMapper;
import pl.jaszczomb.appserverside.mapper.UserMapper;
import pl.jaszczomb.appserverside.service.db.ProductService;
import pl.jaszczomb.appserverside.service.db.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("users")
public class UserController {

    @Autowired private UserService userService;
    @Autowired private UserMapper userMapper;
    @Autowired private ProductService productService;
    @Autowired private ProductMapper productMapper;
    @Autowired private ImageMapper imageMapper;

    @PostMapping("register")
    public void createUser(@RequestBody UserDto userDto) {
        userService.saveUser(userMapper.mapToUser(userDto));
    }

    @PostMapping("login")
    public boolean performLogin(@RequestBody CredentialDto credentialDto) throws Exception {
        User user = userService.getUserByEmail(credentialDto.getEmail()).orElseThrow(Exception::new);
        return user.getPassword().equals(credentialDto.getPassword());
    }

    @GetMapping
    public List<UserDto> getUsers() {
        return userMapper.mapToUserDtoList(userService.getUsers());
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userMapper.mapToUserDto(userService.saveUser(userMapper.mapToUser(userDto)));
    }

//    @PutMapping("uploadimage")
//    public ProductDto uploadImage(@RequestBody ProductDto productDto) throws Exception {
//        Product product = productService.getProduct(productDto.getId()).orElseThrow(Exception::new);
//        product.getImage().addAll(imageMapper.mapToImageList(productDto.getImage()));
//        return productMapper.mapToProductDto(productService.saveProduct(product));
//    }
//
//    @PostMapping("removeimage")
//    public void removeImage(@RequestBody ProductDto productDto) throws Exception {
//        Product product = productService.getProduct(productDto.getId()).orElseThrow(Exception::new);
//        product.getImage().removeAll(imageMapper.mapToImageList((productDto.getImage())));
//        productService.saveProduct(product);
//    }

    @GetMapping("/shoppingCart")
    public List<ProductDto> shoppingCart(@RequestBody UserDto userDto) {
        User user = userService.getUserById(userDto.getId()).orElseThrow();
        return productMapper.mapToProductDtoList(user.getCart());
    }

    @PostMapping("addToCart/{productId}")
    public void addToCart(@PathVariable String productId, @RequestBody UserDto userDto) {
        User user = userService.getUserById(userDto.getId()).orElseThrow();
        Optional<Product> productOpt = productService.getProduct(productId);
        productOpt.ifPresent(product -> user.getCart().add(product));
        userService.saveUser(user);
    }

    @PostMapping("removeFromCart/{productId}")
    public void removeFromCart(@PathVariable String productId, @RequestBody UserDto userDto) {
        User user = userService.getUserById(userDto.getId()).orElseThrow();
        Optional<Product> productOpt = productService.getProduct(productId);
        productOpt.ifPresent(product -> user.getCart().remove(product));
        userService.saveUser(user);
    }

    @PostMapping("successBuy")
    public void successBuy(@RequestBody UserDto userDto) {
        User user = userService.getUserById(userDto.getId()).orElseThrow();
        String paymentId = UUID.randomUUID().toString();
        List<Product> cart = user.getCart();
        for (Product product : cart) {
            History history = new History(LocalDate.now(), product.getName(), product.getBrand(), product.getId(),
                    product.getPrice(), product.getQuantity(), paymentId);
            user.getHistory().add(history);
        }
        userService.saveUser(user);
    }
}

