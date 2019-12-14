package pl.jaszczomb.appserverside.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.collection.embedded.Cart;
import pl.jaszczomb.appserverside.dto.ProductDto;
import pl.jaszczomb.appserverside.dto.embedded.CartDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CartMapper {

    @Autowired
    private ProductMapper productMapper;

    public CartDto mapToCartDto(Cart cart) {
        return new CartDto(cart.getId(), cart.getQuantity(), cart.getDate());
    }

    public Cart mapToCart(CartDto cartDto) {
        return new Cart(cartDto.getId(), cartDto.getQuantity(), cartDto.getDate());
    }

    public List<ProductDto> mapToCartDtoList(List<Product> carts) {
        return carts.stream()
                .map(productMapper::mapToProductDto)
                .collect(Collectors.toList());
    }

    public List<Product> mapToCartList(List<ProductDto> cartDtos) {
        return cartDtos.stream()
                .map(productMapper::mapToProduct)
                .collect(Collectors.toList());
    }
}