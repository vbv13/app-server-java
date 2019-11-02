package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "payments")
@Data
@AllArgsConstructor
public class Payment {

    @Id private String _id;

    private List<UserOnPayment> userOnPayment;
    private List<Detail> detail;
    private List<ProductOnPayment> productOnPayment;

    public Payment(String _id, List<UserOnPayment> userOnPayment, List<Detail> detail, List<ProductOnPayment> productOnPayment) {
        this._id = _id;
        this.userOnPayment = userOnPayment;
        this.detail = detail;
        this.productOnPayment = productOnPayment;
    }
}
