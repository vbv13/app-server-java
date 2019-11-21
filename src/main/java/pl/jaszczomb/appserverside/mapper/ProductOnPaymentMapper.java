package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.ProductOnPayment;
import pl.jaszczomb.appserverside.dto.embedded.ProductOnPaymentDto;

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

    public List<ProductOnPayment> mapToProductOnPaymentList(List<ProductOnPaymentDto> productOnPaymentDtos) {
        return productOnPaymentDtos.stream()
                .map(this::mapToProductOnPayment)
                .collect(Collectors.toList());
    }
}
