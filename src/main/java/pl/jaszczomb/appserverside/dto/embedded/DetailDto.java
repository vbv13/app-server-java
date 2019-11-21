package pl.jaszczomb.appserverside.dto.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DetailDto {

    private boolean paid;
    private boolean cancelled;
    private String payerId;
    private String paymentId;
    private String paymentToken;
    private String returnUrl;
    private AddressDto address;
    private String email;
}
