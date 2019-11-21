package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Sort;

import java.util.List;

@Repository
public interface SortRepository extends MongoRepository<Sort, String> {

    @Override
    List<Sort> findAll();
}
