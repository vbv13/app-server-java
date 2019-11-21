package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.jaszczomb.appserverside.collection.embedded.Image;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "products")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private String id;

    private int sold;
    private List<Image> image;
    private String name;
    private String description;
    private int price;
    private Brand brand;
    private boolean shipping;
    private boolean available;
    private Sort sort;
    private int size;
    private boolean publish;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
