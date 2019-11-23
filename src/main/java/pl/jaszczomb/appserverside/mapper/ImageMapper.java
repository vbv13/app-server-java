package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.Image;
import pl.jaszczomb.appserverside.dto.embedded.ImageDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ImageMapper {

    public ImageDto mapToImageDto(Image image) {
        return new ImageDto(image.getPublicId(), image.getUrl());
    }

    public Image mapToImage(ImageDto imageDto) {
        return new Image(imageDto.getPublicId(), imageDto.getUrl());
    }

    public List<ImageDto> mapToImageDtoList(List<Image> images) {
        if (images != null){
            return images.stream()
                    .map(this::mapToImageDto)
                    .collect(Collectors.toList());

        }
        return new ArrayList<>();
    }

    public List<Image> mapToImageList(List<ImageDto> imageDtos) {
        if (imageDtos != null) {
            return imageDtos.stream()
                    .map(this::mapToImage)
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
