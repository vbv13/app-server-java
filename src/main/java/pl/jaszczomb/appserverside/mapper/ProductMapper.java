package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Payment;
import pl.jaszczomb.appserverside.dto.PaymentDto;
import pl.jaszczomb.appserverside.dto.ProductDto;
import pl.jaszczomb.appserverside.collection.Product;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public ProductDto mapToProductDto(Product product) {
        return new ProductDto();
    }

    public Product mapToProduct(ProductDto productDto) {
        return new Product();
    }

    public List<ProductDto> mapToProductDtoList(List<Product> products) {
        return products.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}
