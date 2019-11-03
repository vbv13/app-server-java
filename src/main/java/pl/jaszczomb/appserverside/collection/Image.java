package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.net.URI;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Image {

    private String public_id;
    private String url;
}
