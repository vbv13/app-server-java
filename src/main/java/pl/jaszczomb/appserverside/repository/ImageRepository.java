package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Image;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ImageRepository extends MongoRepository<Image, String> {

    @Override
    List<Image> findAll();
}
