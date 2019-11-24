package pl.jaszczomb.appserverside.dto.embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class UserOnPaymentDto {

    private String id;
    private String name;
    private String lastname;
    private String email;
}
