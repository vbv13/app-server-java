package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "users")
@Data
@AllArgsConstructor
@Getter
@Setter
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
