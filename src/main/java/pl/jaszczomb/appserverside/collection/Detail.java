package pl.jaszczomb.appserverside.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Detail {

    private boolean paid;
    private boolean cancelled;
    private String payerId;
    private String paymentId;
    private String paymentToken;
    private String returnUrl;
    private Address address;
    private String email;

    public Detail(boolean paid, boolean cancelled, String payerId, String paymentId, String paymentToken, String returnUrl, Address address, String email) {
        this.paid = paid;
        this.cancelled = cancelled;
        this.payerId = payerId;
        this.paymentId = paymentId;
        this.paymentToken = paymentToken;
        this.returnUrl = returnUrl;
        this.address = address;
        this.email = email;
    }
}
