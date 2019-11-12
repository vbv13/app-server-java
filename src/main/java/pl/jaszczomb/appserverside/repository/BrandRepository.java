package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Brand;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BrandRepository extends MongoRepository<Brand, String> {

    @Override
    List<Brand> findAll();
}
