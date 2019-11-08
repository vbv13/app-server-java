package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.ImageDto;
import pl.jaszczomb.appserverside.collection.Image;

@Component
public class ImageMapper {

    public ImageDto mapToImageDto(Image image) {
        return new ImageDto();
    }

    public Image mapToImage(ImageDto imageDto) {
        return new Image();
    }
}
