package pl.jaszczomb.appserverside.collection;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id private String _id;

    private List<Cart> cart;
    private List<History> history;
    private int role;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String token;
}
