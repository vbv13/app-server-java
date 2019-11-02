package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "products")
@Data
@AllArgsConstructor
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

    public Product(String _id, int sold, List<Image> image, String name, String description, int price, Brand brand, boolean shipping, boolean available, Sort sort, int size, boolean publish, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this._id = _id;
        this.sold = sold;
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.shipping = shipping;
        this.available = available;
        this.sort = sort;
        this.size = size;
        this.publish = publish;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
