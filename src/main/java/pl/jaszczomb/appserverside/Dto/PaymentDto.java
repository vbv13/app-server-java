package pl.jaszczomb.appserverside.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.jaszczomb.appserverside.collection.Detail;
import pl.jaszczomb.appserverside.collection.ProductOnPayment;
import pl.jaszczomb.appserverside.collection.UserOnPayment;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private List<UserOnPayment> userOnPayment;
    private List<Detail> detail;
    private List<ProductOnPayment> productOnPayment;
}
