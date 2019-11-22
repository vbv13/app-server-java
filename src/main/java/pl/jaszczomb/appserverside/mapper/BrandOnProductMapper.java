package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.BrandOnProduct;
import pl.jaszczomb.appserverside.collection.embedded.SortOnProduct;
import pl.jaszczomb.appserverside.dto.embedded.BrandOnProductDto;
import pl.jaszczomb.appserverside.dto.embedded.SortOnProductDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BrandOnProductMapper {

    public BrandOnProductDto mapToBrandOnProductDto(BrandOnProduct brandOnProduct) {
        return new BrandOnProductDto(brandOnProduct.getName(), brandOnProduct.getId());
    }

    public BrandOnProduct mapToBrandOnProduct(BrandOnProductDto brandOnProductDto) {
        return new BrandOnProduct(brandOnProductDto.getName(), brandOnProductDto.getId());
    }

    public List<BrandOnProductDto> mapToBrandOnProductDtoList(List<BrandOnProduct> brandOnProducts) {
        return brandOnProducts.stream()
                .map(this::mapToBrandOnProductDto)
                .collect(Collectors.toList());
    }

    public List<BrandOnProduct> mapToBrandOnProductList(List<BrandOnProductDto> brandOnProductDtos) {
        return brandOnProductDtos.stream()
                .map(this::mapToBrandOnProduct)
                .collect(Collectors.toList());
    }
}
