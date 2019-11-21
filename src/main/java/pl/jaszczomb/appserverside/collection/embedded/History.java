package pl.jaszczomb.appserverside.collection.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class History {

    private double dateOfPurchase;
    private String name;
    private String brand;
    private String id;
    private int price;
    private int quantity;
    private String paymentId;
}
