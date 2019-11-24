package pl.jaszczomb.appserverside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.dto.temp.ProductFilterDto;
import pl.jaszczomb.appserverside.repository.ProductRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(ProductFilterDto dto) {
        List<Product> products = productRepository.findAll();

        return products;
    }

    public List<Product> getRecentProducts() {
        return productRepository.findAll().stream()
                .sorted(Comparator.comparingInt(Product::getSold))
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProduct(String id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
