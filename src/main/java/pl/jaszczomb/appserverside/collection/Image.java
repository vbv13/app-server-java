package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.net.URI;

@Data
@AllArgsConstructor
public class Image {

    private String public_id;
    private String url;

    public Image(String public_id, String url) {
        this.public_id = public_id;
        this.url = url;
    }
}
