package pl.jaszczomb.appserverside.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.jaszczomb.appserverside.collection.Cart;
import pl.jaszczomb.appserverside.collection.History;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private List<Cart> cart;
    private List<History> history;
    private int role;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String token;
}
