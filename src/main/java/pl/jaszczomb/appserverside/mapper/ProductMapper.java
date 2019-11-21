package pl.jaszczomb.appserverside.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.dto.ProductDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    @Autowired
    private ImageMapper imageMapper;
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private SortMapper sortMapper;

    public ProductDto mapToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getSold(),
                imageMapper.mapToImageDtoList(product.getImage()), product.getName(),
                product.getDescription(), product.getPrice(),
                brandMapper.mapToBrandDto(product.getBrand()), product.isShipping(), product.isAvailable(),
                sortMapper.mapToSortDto(product.getSort()), product.getSize(),
                product.isPublish(), product.getCreatedAt(), product.getUpdatedAt());
    }

    public Product mapToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getSold(),
                imageMapper.mapToImageList(productDto.getImage()), productDto.getName(),
                productDto.getDescription(), productDto.getPrice(),
                brandMapper.mapToBrand(productDto.getBrand()), productDto.isShipping(), productDto.isAvailable(),
                sortMapper.mapToSort(productDto.getSort()), productDto.getSize(),
                productDto.isPublish(), productDto.getCreatedAt(), productDto.getUpdatedAt());
    }

    public List<ProductDto> mapToProductDtoList(List<Product> products) {
        return products.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}
