package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Brand;
import pl.jaszczomb.appserverside.dto.BrandDto;
import pl.jaszczomb.appserverside.dto.PaymentDto;
import pl.jaszczomb.appserverside.collection.Payment;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PaymentMapper {

    public PaymentDto mapToPaymentDto(Payment payment) {
        return new PaymentDto();
    }

    public Payment mapToPayment(PaymentDto paymentDto) {
        return new Payment();
    }

    public List<PaymentDto> mapToPaymentDtoList(List<Payment> payments) {
        return payments.stream()
                .map(this::mapToPaymentDto)
                .collect(Collectors.toList());
    }
}
