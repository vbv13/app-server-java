package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.Image;
import pl.jaszczomb.appserverside.dto.embedded.ImageDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ImageMapper {

    public ImageDto mapToImageDto(Image image) {
        return new ImageDto();
    }

    public Image mapToImage(ImageDto imageDto) {
        return new Image();
    }

    public List<ImageDto> mapToImageDtoList(List<Image> images) {
        return images.stream()
                .map(this::mapToImageDto)
                .collect(Collectors.toList());
    }

    public List<Image> mapToImageList(List<ImageDto> imageDtos) {
        return imageDtos.stream()
                .map(this::mapToImage)
                .collect(Collectors.toList());
    }
}
