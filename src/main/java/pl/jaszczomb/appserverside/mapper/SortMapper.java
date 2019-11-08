package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.SortDto;
import pl.jaszczomb.appserverside.collection.Sort;

@Component
public class SortMapper {

    public SortDto mapToSortDto(Sort sort) {
        return new SortDto();
    }

    public Sort mapToSort(SortDto sortDto) {
        return new Sort();
    }
}
