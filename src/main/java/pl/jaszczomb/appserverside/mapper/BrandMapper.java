package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Brand;
import pl.jaszczomb.appserverside.dto.BrandDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BrandMapper {

    public BrandDto mapToBrandDto(Brand brand) {
        return new BrandDto(brand.getId(), brand.getName());
    }

    public Brand mapToBrand(BrandDto brandDto) {
        return new Brand(brandDto.getId(), brandDto.getName());
    }

    public List<BrandDto> mapToBrandDtoList(List<Brand> brands) {
        return brands.stream()
                .map(this::mapToBrandDto)
                .collect(Collectors.toList());
    }
}
