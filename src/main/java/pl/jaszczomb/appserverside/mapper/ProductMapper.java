package pl.jaszczomb.appserverside.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.dto.ProductDto;
import pl.jaszczomb.appserverside.repository.BrandRepository;
import pl.jaszczomb.appserverside.repository.SortRepository;

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
    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private SortRepository sortRepository;

    public ProductDto mapToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getSold(), imageMapper.mapToImageDtoList(product.getImage()),
                product.getName(), product.getDescription(), product.getPrice(), product.getBrand(),
                product.isShipping(), product.isAvailable(), product.getSort(), product.getSize(), product.isPublish(),
                product.getCreatedAt(), product.getUpdatedAt(), product.getQuantity());
    }

    public Product mapToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getSold(), imageMapper.mapToImageList(productDto.getImage()),
                productDto.getName(), productDto.getDescription(), productDto.getPrice(), productDto.getBrand(),
                productDto.isShipping(), productDto.isAvailable(), productDto.getSort(), productDto.getSize(),
                productDto.isPublish(), productDto.getCreatedAt(), productDto.getUpdatedAt(), productDto.getQuantity());
    }

    public List<ProductDto> mapToProductDtoList(List<Product> products) {
        return products.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}
