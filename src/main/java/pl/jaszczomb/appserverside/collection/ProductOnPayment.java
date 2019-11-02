package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductOnPayment {

    private Double dateOfPurchase;
    private String name;
    private String brand;
    private String id;
    private int price;
    private int quantity;
    private String paymentId;

    public ProductOnPayment(Double dateOfPurchase, String name, String brand, String id, int price, int quantity, String paymentId) {
        this.dateOfPurchase = dateOfPurchase;
        this.name = name;
        this.brand = brand;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.paymentId = paymentId;
    }
}
