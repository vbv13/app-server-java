package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.Dto.PaymentDto;
import pl.jaszczomb.appserverside.collection.Payment;

@Component
public class PaymentMapper {

    public PaymentDto mapToPaymentDto(Payment payment) {
        return new PaymentDto();
    }

    public Payment mapToPayment(PaymentDto paymentDto) {
        return new Payment();
    }
}
