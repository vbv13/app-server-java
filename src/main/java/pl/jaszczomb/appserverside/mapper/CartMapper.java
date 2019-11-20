package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.dto.CartDto;
import pl.jaszczomb.appserverside.collection.embedded.Cart;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CartMapper {

    public CartDto mapToCartDto(Cart cart) {
        return new CartDto();
    }

    public Cart mapToCart(CartDto cartDto) {
        return new Cart();
    }

    public List<CartDto> mapToCartDtoList(List<Cart> carts) {
        return carts.stream()
                .map(this::mapToCartDto)
                .collect(Collectors.toList());
    }
}
