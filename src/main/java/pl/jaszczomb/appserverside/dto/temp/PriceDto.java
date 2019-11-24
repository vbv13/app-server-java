package pl.jaszczomb.appserverside.dto.temp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(value = "true")
public class PriceDto {

    private int lowerPrice;
    private int upperPrice;
}
