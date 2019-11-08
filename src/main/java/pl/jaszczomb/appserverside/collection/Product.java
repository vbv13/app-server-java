package pl.jaszczomb.appserverside.collection;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "products")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id private String _id;

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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
