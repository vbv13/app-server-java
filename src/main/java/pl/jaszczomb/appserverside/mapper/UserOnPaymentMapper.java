package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Image;
import pl.jaszczomb.appserverside.dto.ImageDto;
import pl.jaszczomb.appserverside.dto.UserOnPaymentDto;
import pl.jaszczomb.appserverside.collection.UserOnPayment;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class UserOnPaymentMapper {

    public UserOnPaymentDto mapToUserOnPaymentDto(UserOnPayment userOnPayment) {
        return new UserOnPaymentDto();
    }

    public UserOnPayment mapToUserOnPayment(UserOnPaymentDto userOnPaymentDto) {
        return new UserOnPayment();
    }

    public List<UserOnPaymentDto> mapToUserOnPaymentDtoList(List<UserOnPayment> userOnPayments) {
        return userOnPayments.stream()
                .map(this::mapToUserOnPaymentDto)
                .collect(Collectors.toList());
    }
}
