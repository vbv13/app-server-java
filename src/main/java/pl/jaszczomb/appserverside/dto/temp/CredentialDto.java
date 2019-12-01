package pl.jaszczomb.appserverside.dto.temp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CredentialDto {

    private String email;
    private String password;
}
