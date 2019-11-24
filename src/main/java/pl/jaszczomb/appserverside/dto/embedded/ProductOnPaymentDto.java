package pl.jaszczomb.appserverside.dto.embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class ProductOnPaymentDto {

    private double dateOfPurchase;
    private String name;
    private String brand;
    private String id;
    private int price;
    private int quantity;
    private String paymentId;
}
