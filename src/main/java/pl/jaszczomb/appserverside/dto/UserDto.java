package pl.jaszczomb.appserverside.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private List<CartDto> cart;
    private List<HistoryDto> history;
    private int role;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String token;
}
