package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.UserOnPayment;
import pl.jaszczomb.appserverside.dto.embedded.UserOnPaymentDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserOnPaymentMapper {

    public UserOnPaymentDto mapToUserOnPaymentDto(UserOnPayment userOnPayment) {
        return new UserOnPaymentDto(userOnPayment.getId(), userOnPayment.getName(),
                userOnPayment.getLastname(), userOnPayment.getEmail());
    }

    public UserOnPayment mapToUserOnPayment(UserOnPaymentDto userOnPaymentDto) {
        return new UserOnPayment(userOnPaymentDto.getId(), userOnPaymentDto.getName(),
                userOnPaymentDto.getLastname(), userOnPaymentDto.getEmail());
    }

    public List<UserOnPaymentDto> mapToUserOnPaymentDtoList(List<UserOnPayment> userOnPayments) {
        return userOnPayments.stream()
                .map(this::mapToUserOnPaymentDto)
                .collect(Collectors.toList());
    }

    public List<UserOnPayment> mapToUserOnPaymentList(List<UserOnPaymentDto> userOnPaymentDtos) {
        return userOnPaymentDtos.stream()
                .map(this::mapToUserOnPayment)
                .collect(Collectors.toList());
    }
}
