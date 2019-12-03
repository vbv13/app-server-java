package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.embedded.Cart;

import java.util.List;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {

    @Override
    List<Cart> findAll();
}