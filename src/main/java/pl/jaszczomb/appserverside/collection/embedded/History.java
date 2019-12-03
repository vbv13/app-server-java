package pl.jaszczomb.appserverside.collection.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class History {

    private LocalDate dateOfPurchase;
    private String name;
    private String brand;
    private String id;
    private int price;
    private int quantity;
    private String paymentId;
}
