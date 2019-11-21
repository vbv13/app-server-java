package pl.jaszczomb.appserverside.dto.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CartDto {

    private String id;
    private int quantity;
    private double date;
}
