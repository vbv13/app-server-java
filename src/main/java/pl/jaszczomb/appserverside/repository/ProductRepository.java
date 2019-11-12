package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Product;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    List<Product> findAll();
}
