package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "sorts")
@Data
@AllArgsConstructor
public class Sort {

    @Id private String _id;

    private String name;

    public Sort(String _id, String name) {
        this._id = _id;
        this.name = name;
    }
}
