package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.ProductOnPaymentDto;
import pl.jaszczomb.appserverside.collection.ProductOnPayment;

@Component
public class ProductOnPaymentMapper {

    public ProductOnPaymentDto mapToProductOnPaymentDto(ProductOnPayment productOnPayment) {
        return new ProductOnPaymentDto();
    }

    public ProductOnPayment mapToProductOnPayment(ProductOnPaymentDto productOnPaymentDto) {
        return new ProductOnPayment();
    }
}
