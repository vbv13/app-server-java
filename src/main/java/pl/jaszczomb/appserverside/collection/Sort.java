package pl.jaszczomb.appserverside.collection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "sorts")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sort {

    @Id
    private String id;

    private String name;
}
