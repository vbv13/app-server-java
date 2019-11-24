package pl.jaszczomb.appserverside.dto.embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
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
