package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.jaszczomb.appserverside.collection.embedded.BrandOnProduct;
import pl.jaszczomb.appserverside.collection.embedded.Image;
import pl.jaszczomb.appserverside.collection.embedded.SortOnProduct;

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
    private BrandOnProduct brand;
    private boolean shipping;
    private boolean available;
    private SortOnProduct sort;
    private int size;
    private boolean publish;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
