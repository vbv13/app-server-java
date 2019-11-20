package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.embedded.History;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface HistoryRepository extends MongoRepository<History, String> {

    @Override
    List<History> findAll();
}
