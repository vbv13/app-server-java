package pl.jaszczomb.appserverside.collection.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
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
