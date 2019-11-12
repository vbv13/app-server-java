package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.dto.CartDto;
import pl.jaszczomb.appserverside.collection.Cart;

@Component
public class CartMapper {

    public CartDto mapToCartDto(Cart cart) {
        return new CartDto();
    }

    public Cart mapToCart(CartDto cartDto) {
        return new Cart();
    }
}
