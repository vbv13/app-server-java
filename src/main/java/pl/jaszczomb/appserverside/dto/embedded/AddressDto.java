package pl.jaszczomb.appserverside.dto.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    private String recipient_name;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postal_code;
    private String country_code;
}
