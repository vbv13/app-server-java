package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.History;
import pl.jaszczomb.appserverside.dto.embedded.HistoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HistoryMapper {

    public HistoryDto mapToHistoryDto(History history) {
        return new HistoryDto(history.getDateOfPurchase(), history.getName(), history.getBrand(),
                history.getId(), history.getPrice(), history.getQuantity(), history.getPaymentId());
    }

    public History mapToHistory(HistoryDto historyDto) {
        return new History(historyDto.getDateOfPurchase(), historyDto.getName(), historyDto.getBrand(),
                historyDto.getId(), historyDto.getPrice(), historyDto.getQuantity(), historyDto.getPaymentId());
    }

    public List<HistoryDto> mapToHistoryDtoList(List<History> histories) {
        return histories.stream()
                .map(this::mapToHistoryDto)
                .collect(Collectors.toList());
    }

    public List<History> mapToHistoryList(List<HistoryDto> historyDtos) {
        return historyDtos.stream()
                .map(this::mapToHistory)
                .collect(Collectors.toList());
    }
}
