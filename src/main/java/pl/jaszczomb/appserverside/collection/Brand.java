package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "brands")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    @Id
    private String id;
    private String name;
}
