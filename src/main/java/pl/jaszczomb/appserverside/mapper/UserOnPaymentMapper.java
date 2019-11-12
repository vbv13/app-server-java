package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.dto.UserOnPaymentDto;
import pl.jaszczomb.appserverside.collection.UserOnPayment;


@Component
public class UserOnPaymentMapper {

    public UserOnPaymentDto mapToUserOnPaymentDto(UserOnPayment userOnPayment) {
        return new UserOnPaymentDto();
    }

    public UserOnPayment mapToUserOnPayment(UserOnPaymentDto userOnPaymentDto) {
        return new UserOnPayment();
    }
}
