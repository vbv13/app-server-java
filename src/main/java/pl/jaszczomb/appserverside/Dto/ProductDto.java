package pl.jaszczomb.appserverside.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
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
    private Date createdAt;
    private Date updatedAt;
}
