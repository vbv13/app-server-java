package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.embedded.Detail;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DetailRepository extends MongoRepository<Detail, String> {

    @Override
    List<Detail> findAll();
}
