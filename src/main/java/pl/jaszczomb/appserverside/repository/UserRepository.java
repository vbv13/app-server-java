package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Override
    List<User> findAll();
}
