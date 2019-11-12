package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.dto.ProductDto;
import pl.jaszczomb.appserverside.dto.SortDto;
import pl.jaszczomb.appserverside.collection.Sort;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SortMapper {

    public SortDto mapToSortDto(Sort sort) {
        return new SortDto();
    }

    public Sort mapToSort(SortDto sortDto) {
        return new Sort();
    }

    public List<SortDto> mapToSortDtoList(List<Sort> sorts) {
        return sorts.stream()
                .map(this::mapToSortDto)
                .collect(Collectors.toList());
    }
}
