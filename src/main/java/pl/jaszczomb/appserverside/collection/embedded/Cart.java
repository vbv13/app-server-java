package pl.jaszczomb.appserverside.collection.embedded;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private String id;

    private int quantity;
    private double date;
}
