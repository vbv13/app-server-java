package pl.jaszczomb.appserverside.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jaszczomb.appserverside.dto.embedded.ImageDto;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
public class ProductDto {

    private String id;
    private int sold;
    private List<ImageDto> image;
    private String name;
    private String description;
    private int price;
    private BrandDto brand;
    private boolean shipping;
    private boolean available;
    private SortDto sort;
    private int size;
    private boolean publish;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
