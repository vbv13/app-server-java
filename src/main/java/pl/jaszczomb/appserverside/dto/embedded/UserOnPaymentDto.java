package pl.jaszczomb.appserverside.dto.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserOnPaymentDto {

    private String id;
    private String name;
    private String lastname;
    private String email;
}
