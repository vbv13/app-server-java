package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Cart;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CartRepository extends MongoRepository<Cart, String> {

    @Override
    List<Cart> findAll();
}
