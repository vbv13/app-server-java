package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Address")
@Data
@AllArgsConstructor
public class Address {

    private String recipient_name;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postal_code;
    private String country_code;

    public Address(String recipient_name, String line1, String line2, String city, String state, String postal_code, String country_code) {
        this.recipient_name = recipient_name;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.country_code = country_code;
    }
}
