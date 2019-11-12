package pl.jaszczomb.appserverside.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private List<UserOnPaymentDto> userOnPayment;
    private List<DetailDto> detail;
    private List<ProductOnPaymentDto> productOnPayment;
}
