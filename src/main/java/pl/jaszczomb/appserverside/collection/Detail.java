package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Detail {

    private boolean paid;
    private boolean cancelled;
    private String payerId;
    private String paymentId;
    private String paymentToken;
    private String returnUrl;
    private Address address;
    private String email;
}
