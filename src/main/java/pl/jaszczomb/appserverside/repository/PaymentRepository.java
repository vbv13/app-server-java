package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Payment;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface PaymentRepository extends MongoRepository<Payment, String> {

    @Override
    List<Payment> findAll();
}
