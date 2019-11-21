package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Sort;
import pl.jaszczomb.appserverside.dto.SortDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SortMapper {

    public SortDto mapToSortDto(Sort sort) {
        return new SortDto(sort.getId(), sort.getName());
    }

    public Sort mapToSort(SortDto sortDto) {
        return new Sort(sortDto.getId(), sortDto.getName());
    }

    public List<SortDto> mapToSortDtoList(List<Sort> sorts) {
        return sorts.stream()
                .map(this::mapToSortDto)
                .collect(Collectors.toList());
    }
}
