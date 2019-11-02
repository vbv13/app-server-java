package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cart {

    private String id;

    private int quantity;
    private double date;

    public Cart(String id, int quantity, double date) {
        this.id = id;
        this.quantity = quantity;
        this.date = date;
    }
}
