package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
}
