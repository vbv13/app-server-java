package pl.jaszczomb.appserverside.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jaszczomb.appserverside.dto.embedded.HistoryDto;

import java.util.List;

@Getter
@AllArgsConstructor
public class UserDto {

    private String id;
    private List<HistoryDto> history;
    private int role;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String token;
}
