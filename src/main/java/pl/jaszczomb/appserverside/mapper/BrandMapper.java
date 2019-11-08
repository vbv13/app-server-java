package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.BrandDto;
import pl.jaszczomb.appserverside.collection.Brand;

@Component
public class BrandMapper {

    public BrandDto mapToBrandDto(Brand brand) {
        return new BrandDto();
    }

    public Brand mapToBrand(BrandDto brandDto) {
        return new Brand();
    }
}
