package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.HistoryDto;
import pl.jaszczomb.appserverside.collection.History;

@Component
public class HistoryMapper {

    public HistoryDto mapToHistoryDto(History history) {
        return new HistoryDto();
    }

    public History mapToHistory(HistoryDto historyDto) {
        return new History();
    }
}
