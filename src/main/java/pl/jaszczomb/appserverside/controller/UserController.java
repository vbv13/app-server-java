package pl.jaszczomb.appserverside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.dto.ProductDto;
import pl.jaszczomb.appserverside.dto.UserDto;
import pl.jaszczomb.appserverside.dto.temp.CredentialDto;
import pl.jaszczomb.appserverside.mapper.CartMapper;
import pl.jaszczomb.appserverside.mapper.ImageMapper;
import pl.jaszczomb.appserverside.mapper.ProductMapper;
import pl.jaszczomb.appserverside.mapper.UserMapper;
import pl.jaszczomb.appserverside.service.db.CartService;
import pl.jaszczomb.appserverside.service.db.ProductService;
import pl.jaszczomb.appserverside.service.db.UserService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("users")
public class UserController {

    @Autowired private UserService userService;
    @Autowired private UserMapper userMapper;
    @Autowired private ProductService productService;
    @Autowired private ProductMapper productMapper;
    @Autowired private ImageMapper imageMapper;
    @Autowired private CartService cartService;

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

    @PutMapping("uploadimage")
    public ProductDto uploadImage(@RequestBody ProductDto productDto) throws Exception {
        Product product = productService.getProduct(productDto.getId()).orElseThrow(Exception::new);
        product.getImage().addAll(imageMapper.mapToImageList(productDto.getImage()));
        return productMapper.mapToProductDto(productService.saveProduct(product));
    }

    @PostMapping("removeimage")
    public void removeImage(@RequestBody ProductDto productDto) throws Exception {
        Product product = productService.getProduct(productDto.getId()).orElseThrow(Exception::new);
        product.getImage().removeAll(imageMapper.mapToImageList((productDto.getImage())));
        productService.saveProduct(product);
    }

    @GetMapping("/shoppingCart")
    public ModelAndView shoppingCart() {
        ModelAndView modelAndView = new ModelAndView("/shoppingCart");
        modelAndView.addObject("products", cartService.getProductsInCart());
        return modelAndView;
    }

    @PostMapping("addToCart/{productId}")
    public ModelAndView addToCart(@PathVariable("productId") String productId) {
        productService.getProduct(productId).ifPresent(cartService::addProduct);
        return shoppingCart();
    }

    @GetMapping("removeFromCart/{productId}")
    public ModelAndView removeFromCart(@PathVariable("productId") String productId) {
        productService.getProduct(productId).ifPresent((cartService::removeProduct));
        return shoppingCart();
    }

    @PostMapping("successBuy")
    public void successBuy() {


    }
}

