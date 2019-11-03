package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Address {

    private String recipient_name;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postal_code;
    private String country_code;
}
