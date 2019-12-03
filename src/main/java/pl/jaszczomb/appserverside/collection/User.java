package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.jaszczomb.appserverside.collection.embedded.History;

import java.util.List;

@Document(collection = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private List<Product> cart;
    private List<History> history;
    private String role;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String token;
}
