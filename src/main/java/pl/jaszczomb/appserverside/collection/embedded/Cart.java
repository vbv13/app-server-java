package pl.jaszczomb.appserverside.collection.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private String id;
    private int quantity;
    private double date;
}