package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@Getter
@Setter
public class UserOnPayment {

    @Id private String id;
    private String name;
    private String lastname;
    private String email;
}
