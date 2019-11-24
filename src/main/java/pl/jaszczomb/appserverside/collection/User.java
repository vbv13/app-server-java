package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.jaszczomb.appserverside.collection.embedded.Cart;
import pl.jaszczomb.appserverside.collection.embedded.History;

import java.util.List;

@Document(collection = "users")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private List<Cart> cart;
    private List<History> history;
    private int role;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String token;
}
