package pl.jaszczomb.appserverside.collection;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "sorts")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sort {

    @Id private String id;

    private String name;
}
