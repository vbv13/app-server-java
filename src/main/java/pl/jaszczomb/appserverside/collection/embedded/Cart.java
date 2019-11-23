package pl.jaszczomb.appserverside.collection.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @DBRef
    private String id;
    private int quantity;
    private double date;
}
