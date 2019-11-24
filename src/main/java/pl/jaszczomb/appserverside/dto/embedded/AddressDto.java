package pl.jaszczomb.appserverside.dto.embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class AddressDto {

    private String recipientName;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postalCode;
    private String countryCode;
}
