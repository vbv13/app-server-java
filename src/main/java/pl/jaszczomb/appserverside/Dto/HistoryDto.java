package pl.jaszczomb.appserverside.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoryDto {
    private double dateOfPurchase;
    private String name;
    private String brand;
    private String id;
    private int price;
    private int quantity;
    private String paymentId;
}
