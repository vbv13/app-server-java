package pl.jaszczomb.appserverside.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.jaszczomb.appserverside.dto.embedded.ImageDto;

import java.time.LocalDate;
import java.util.List;

@Document
@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = "true")
public class ProductDto {

    private String id;
    private int sold;
    private List<ImageDto> image;
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
