package pl.jaszczomb.appserverside.dto.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ImageDto {

    private String publicId;
    private String url;
}
