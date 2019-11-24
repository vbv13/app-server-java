package pl.jaszczomb.appserverside.dto.temp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = "true")
public class SizeDto {
    private String name;
}
