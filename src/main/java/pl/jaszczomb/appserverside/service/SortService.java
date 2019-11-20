package pl.jaszczomb.appserverside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jaszczomb.appserverside.collection.Brand;
import pl.jaszczomb.appserverside.collection.Sort;
import pl.jaszczomb.appserverside.repository.SortRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SortService {

    @Autowired
    private SortRepository sortRepository;

    public List<Sort> getSorts() {
        return sortRepository.findAll();
    }

    public Optional<Sort> getSort(String id) {
        return sortRepository.findById(id);
    }

    public Sort saveSort(Sort sort) {
        return sortRepository.save(sort);
    }

    public void deleteSort(String id) {
        sortRepository.deleteById(id);
    }
}
