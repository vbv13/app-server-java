package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.dto.BrandDto;
import pl.jaszczomb.appserverside.collection.Brand;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BrandMapper {

    public BrandDto mapToBrandDto(Brand brand) {
        return new BrandDto();
    }

    public Brand mapToBrand(BrandDto brandDto) {
        return new Brand();
    }

    public List<BrandDto> mapToBrandDtoList(List<Brand> brands) {
        return brands.stream()
                .map(this::mapToBrandDto)       //wskazanie referencji do metody mapToBrandDto
                .collect(Collectors.toList());   //tworzy kolekcję w postaci listy
    }
}
