package pl.jaszczomb.appserverside.collection.embedded;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String recipient_name;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postal_code;
    private String country_code;
}
