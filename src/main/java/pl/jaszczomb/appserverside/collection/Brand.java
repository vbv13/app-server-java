package pl.jaszczomb.appserverside.collection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "brands")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    @Id
    private String _id;

    private String name;
}
