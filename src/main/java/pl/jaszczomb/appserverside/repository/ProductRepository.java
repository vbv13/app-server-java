package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Brand;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.collection.Sort;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    List<Product> findAll();

    @Override
    Optional<Product> findById(String s);
}
