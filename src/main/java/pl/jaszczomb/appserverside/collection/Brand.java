package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "brands")
@Data
@AllArgsConstructor
@Getter
@Setter
public class Brand {

    @Id private String _id;

    private String name;
}
