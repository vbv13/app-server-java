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
    private BrandOnProductMapper brandOnProductMapper;
    @Autowired
    private SortOnProductMapper sortOnProductMapper;

    public ProductDto mapToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getSold(),
                imageMapper.mapToImageDtoList(product.getImage()), product.getName(),
                product.getDescription(), product.getPrice(),
                brandOnProductMapper.mapToBrandOnProductDto(product.getBrand()), product.isShipping(), product.isAvailable(),   //??getBrandOnProduct
                sortOnProductMapper.mapToSortOnProductDto(product.getSort()), product.getSize(),    //?getSortOnProduct()
                product.isPublish(), product.getCreatedAt(), product.getUpdatedAt());
    }

    public Product mapToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getSold(),
                imageMapper.mapToImageList(productDto.getImage()), productDto.getName(),
                productDto.getDescription(), productDto.getPrice(),
                brandOnProductMapper.mapToBrandOnProduct(productDto.getBrand()), productDto.isShipping(), productDto.isAvailable(), //?getBrandOnProduct()
                sortOnProductMapper.mapToSortOnProduct(productDto.getSort()), productDto.getSize(), //?getSortOnProduct()
                productDto.isPublish(), productDto.getCreatedAt(), productDto.getUpdatedAt());
    }

    public List<ProductDto> mapToProductDtoList(List<Product> products) {
        return products.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }
}
