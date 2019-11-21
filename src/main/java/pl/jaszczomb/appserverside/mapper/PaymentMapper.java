package pl.jaszczomb.appserverside.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.Payment;
import pl.jaszczomb.appserverside.dto.PaymentDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PaymentMapper {

    @Autowired
    private UserOnPaymentMapper userOnPaymentMapper;
    @Autowired
    private DetailMapper detailMapper;
    @Autowired
    private ProductOnPaymentMapper productOnPaymentMapper;

    public PaymentDto mapToPaymentDto(Payment payment) {
        return new PaymentDto(payment.getId(),
                userOnPaymentMapper.mapToUserOnPaymentDtoList(payment.getUserOnPayment()),
                detailMapper.mapToDetailDtoList(payment.getDetail()),
                productOnPaymentMapper.mapToProductOnPaymentDtoList(payment.getProductOnPayment()));
    }

    public Payment mapToPayment(PaymentDto paymentDto) {
        return new Payment(paymentDto.getId(),
                userOnPaymentMapper.mapToUserOnPaymentList(paymentDto.getUserOnPayment()),
                detailMapper.mapToDetailList(paymentDto.getDetail()),
                productOnPaymentMapper.mapToProductOnPaymentList(paymentDto.getProductOnPayment()));
    }

    public List<PaymentDto> mapToPaymentDtoList(List<Payment> payments) {
        return payments.stream()
                .map(this::mapToPaymentDto)
                .collect(Collectors.toList());
    }
}
