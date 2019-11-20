package pl.jaszczomb.appserverside.collection.embedded;

import lombok.*;
import pl.jaszczomb.appserverside.collection.embedded.Address;

@Data
@Getter
@Setter
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
