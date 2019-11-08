package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.ProductDto;
import pl.jaszczomb.appserverside.collection.Product;

@Component
public class ProductMapper {

    public ProductDto mapToProductDto(Product product) {
        return new ProductDto();
    }

    public Product mapToProduct(ProductDto productDto) {
        return new Product();
    }
}
