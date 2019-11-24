package pl.jaszczomb.appserverside.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jaszczomb.appserverside.dto.embedded.DetailDto;
import pl.jaszczomb.appserverside.dto.embedded.ProductOnPaymentDto;
import pl.jaszczomb.appserverside.dto.embedded.UserOnPaymentDto;

import java.util.List;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class PaymentDto {

    private String id;
    private List<UserOnPaymentDto> userOnPayment;
    private List<DetailDto> detail;
    private List<ProductOnPaymentDto> productOnPayment;
}
