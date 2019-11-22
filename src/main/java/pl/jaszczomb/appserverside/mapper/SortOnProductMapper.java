package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.SortOnProduct;
import pl.jaszczomb.appserverside.dto.embedded.SortOnProductDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SortOnProductMapper {

    public SortOnProductDto mapToSortOnProductDto(SortOnProduct sortOnProduct) {
        return new SortOnProductDto(sortOnProduct.getName(), sortOnProduct.getId());
    }

    public SortOnProduct mapToSortOnProduct(SortOnProductDto sortOnProductDto) {
        return new SortOnProduct(sortOnProductDto.getName(), sortOnProductDto.getId());
    }

    public List<SortOnProductDto> mapToSortOnProductDtoList(List<SortOnProduct> sortOnProducts) {
        return sortOnProducts.stream()
                .map(this::mapToSortOnProductDto)
                .collect(Collectors.toList());
    }

    public List<SortOnProduct> mapToSortOnProductList(List<SortOnProductDto> sortOnProductDtos) {
        return sortOnProductDtos.stream()
                .map(this::mapToSortOnProduct)
                .collect(Collectors.toList());
    }
}
