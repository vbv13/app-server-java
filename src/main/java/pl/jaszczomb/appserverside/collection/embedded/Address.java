package pl.jaszczomb.appserverside.collection.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String recipientName;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postalCode;
    private String countryCode;
}
