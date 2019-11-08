package pl.jaszczomb.appserverside.collection;

import lombok.*;

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
