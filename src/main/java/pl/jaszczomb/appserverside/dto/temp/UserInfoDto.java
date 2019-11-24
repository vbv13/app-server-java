package pl.jaszczomb.appserverside.dto.temp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jaszczomb.appserverside.dto.embedded.HistoryDto;

import java.util.List;

@Getter
@AllArgsConstructor
public class UserInfoDto {

    private boolean isAdmin;
    private boolean isAuth;
    private String email;
    private String name;
    private String lastname;
    private int role;
    private List<CardDto> cart;
    private List<HistoryDto> history;
}
