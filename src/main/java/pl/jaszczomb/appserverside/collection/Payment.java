package pl.jaszczomb.appserverside.collection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.jaszczomb.appserverside.collection.embedded.Detail;
import pl.jaszczomb.appserverside.collection.embedded.ProductOnPayment;
import pl.jaszczomb.appserverside.collection.embedded.UserOnPayment;

import java.util.List;

@Document(collection = "payments")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    private String id;

    private List<UserOnPayment> userOnPayment;
    private List<Detail> detail;
    private List<ProductOnPayment> productOnPayment;
}
