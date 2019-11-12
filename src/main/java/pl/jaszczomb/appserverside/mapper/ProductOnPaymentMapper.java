package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.User;
import pl.jaszczomb.appserverside.dto.ProductOnPaymentDto;
import pl.jaszczomb.appserverside.collection.ProductOnPayment;
import pl.jaszczomb.appserverside.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductOnPaymentMapper {

    public ProductOnPaymentDto mapToProductOnPaymentDto(ProductOnPayment productOnPayment) {
        return new ProductOnPaymentDto();
    }

    public ProductOnPayment mapToProductOnPayment(ProductOnPaymentDto productOnPaymentDto) {
        return new ProductOnPayment();
    }

    public List<ProductOnPaymentDto> mapToProductOnPaymentDtoList(List<ProductOnPayment> productOnPayments) {
        return productOnPayments.stream()
                .map(this::mapToProductOnPaymentDto)
                .collect(Collectors.toList());
    }
}
