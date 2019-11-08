package pl.jaszczomb.appserverside.collection;

import lombok.*;

import javax.persistence.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserOnPayment {

    @Id private String id;
    private String name;
    private String lastname;
    private String email;
}
