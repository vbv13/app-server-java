package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "users")
@Data
@AllArgsConstructor
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

    public User(String _id, List<Cart> cart, List<History> history, int role, String email, String password, String name, String lastname, String token) {
        this._id = _id;
        this.cart = cart;
        this.history = history;
        this.role = role;
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.token = token;
    }
}
