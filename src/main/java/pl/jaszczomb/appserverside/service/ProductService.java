package pl.jaszczomb.appserverside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() { return productRepository.findAll(); }

    public Optional<Product> getProduct(String _id) { return productRepository.findById(_id); }

    public Product saveProduct(Product product) { return productRepository.save(product); }

    public void deleteDiet(String _id) { productRepository.deleteById(_id); }
}
