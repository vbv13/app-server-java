package pl.jaszczomb.appserverside.collection.embedded;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.net.URI;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    private String public_id;
    private String url;
}
