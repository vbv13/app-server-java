package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Cart;
import pl.jaszczomb.appserverside.dto.CartDto;
import pl.jaszczomb.appserverside.dto.DetailDto;
import pl.jaszczomb.appserverside.collection.Detail;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DetailMapper {

    public DetailDto mapToDetailDto(Detail detail) {
        return new DetailDto();
    }

    public Detail mapToDetail(DetailDto detailDto) {
        return new Detail();
    }

    public List<DetailDto> mapToDetailDtoList(List<Detail> details) {
        return details.stream()
                .map(this::mapToDetailDto)
                .collect(Collectors.toList());
    }
}
