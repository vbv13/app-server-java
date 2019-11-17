package pl.jaszczomb.appserverside.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.UserOnPayment;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserOnPaymentRepository extends MongoRepository<UserOnPayment, String> {

    @Override
    List<UserOnPayment> findAll();
}
