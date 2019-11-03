package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "payments")
@Data
@AllArgsConstructor
@Getter
@Setter
public class Payment {

    @Id private String _id;

    private List<UserOnPayment> userOnPayment;
    private List<Detail> detail;
    private List<ProductOnPayment> productOnPayment;
}
