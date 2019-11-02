package pl.jaszczomb.appserverside.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.jaszczomb.appserverside.collection.Brand;
import pl.jaszczomb.appserverside.collection.Image;
import pl.jaszczomb.appserverside.collection.Sort;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
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
