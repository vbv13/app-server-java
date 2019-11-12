package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.dto.DetailDto;
import pl.jaszczomb.appserverside.collection.Detail;

@Component
public class DetailMapper {

    public DetailDto mapToDetailDto(Detail detail) {
        return new DetailDto();
    }

    public Detail mapToDetail(DetailDto detailDto) {
        return new Detail();
    }
}
