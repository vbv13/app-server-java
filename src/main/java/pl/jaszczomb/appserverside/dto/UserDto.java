package pl.jaszczomb.appserverside.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jaszczomb.appserverside.dto.embedded.CartDto;
import pl.jaszczomb.appserverside.dto.embedded.HistoryDto;

import java.util.List;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class UserDto {

    private String id;
    private List<ProductDto> cart;
    private List<HistoryDto> history;
    private String role;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String token;
}
