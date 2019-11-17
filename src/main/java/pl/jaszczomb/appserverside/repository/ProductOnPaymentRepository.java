package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.ProductOnPayment;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ProductOnPaymentRepository extends MongoRepository<ProductOnPayment, String> {

    @Override
    List<ProductOnPayment> findAll();
}
