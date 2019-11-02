package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Payment;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {
}
