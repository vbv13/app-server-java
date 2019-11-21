package pl.jaszczomb.appserverside.dto.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductOnPaymentDto {

    private double dateOfPurchase;
    private String name;
    private String brand;
    private String id;
    private int price;
    private int quantity;
    private String paymentId;
}
