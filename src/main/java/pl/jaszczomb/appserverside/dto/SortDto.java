package pl.jaszczomb.appserverside.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class SortDto {

    private String id;
    private String name;
}
