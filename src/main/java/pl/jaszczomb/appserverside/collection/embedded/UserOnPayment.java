package pl.jaszczomb.appserverside.collection.embedded;

import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserOnPayment {

    private String id;
    private String name;
    private String lastname;
    private String email;
}
