package pl.jaszczomb.appserverside.collection;

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
