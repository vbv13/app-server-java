package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.ProductOnPayment;
import pl.jaszczomb.appserverside.dto.embedded.ProductOnPaymentDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductOnPaymentMapper {

    public ProductOnPaymentDto mapToProductOnPaymentDto(ProductOnPayment productOnPayment) {
        return new ProductOnPaymentDto(productOnPayment.getDateOfPurchase(), productOnPayment.getName(),
                productOnPayment.getBrand(), productOnPayment.getId(), productOnPayment.getPrice(),
                productOnPayment.getQuantity(), productOnPayment.getPaymentId());
    }

    public ProductOnPayment mapToProductOnPayment(ProductOnPaymentDto productOnPaymentDto) {
        return new ProductOnPayment(productOnPaymentDto.getDateOfPurchase(), productOnPaymentDto.getName(),
                productOnPaymentDto.getBrand(), productOnPaymentDto.getId(), productOnPaymentDto.getPrice(),
                productOnPaymentDto.getQuantity(), productOnPaymentDto.getPaymentId());
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
