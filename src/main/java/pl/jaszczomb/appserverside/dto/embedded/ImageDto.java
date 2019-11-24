package pl.jaszczomb.appserverside.dto.embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class ImageDto {

    private String publicId;
    private String url;
}
