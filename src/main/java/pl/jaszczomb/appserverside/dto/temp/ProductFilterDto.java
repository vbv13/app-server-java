package pl.jaszczomb.appserverside.dto.temp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jaszczomb.appserverside.dto.BrandDto;
import pl.jaszczomb.appserverside.dto.SortDto;

import java.util.List;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class ProductFilterDto {

    private List<BrandDto> brandDtos;
    private List<SizeDto> sizeDtos;
    private List<SortDto> sortDtos;
    private PriceDto priceDto;
}
