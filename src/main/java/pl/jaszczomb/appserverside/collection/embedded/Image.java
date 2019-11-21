package pl.jaszczomb.appserverside.collection.embedded;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    private String public_id;
    private String url;
}
