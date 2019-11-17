package pl.jaszczomb.appserverside.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.jaszczomb.appserverside.collection.Address;


import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AddressRepository extends MongoRepository<Address, String> {

    @Override
    List<Address> findAll();
}
