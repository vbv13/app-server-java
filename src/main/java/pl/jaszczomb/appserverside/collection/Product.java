package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import pl.jaszczomb.appserverside.collection.embedded.Image;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private int sold;
    private List<Image> image;
    private String name;
    private String description;
    private int price;
    private String brand;
    private boolean shipping;
    private boolean available;
    private String sort;
    private int size;
    private boolean publish;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
