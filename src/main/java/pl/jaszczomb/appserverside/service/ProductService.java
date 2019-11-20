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
        if (!dto.getBrandDtos().isEmpty()) {
            products = products.stream()
                    .filter(p -> dto.getBrandDtos().contains(p.getBrand()))
                    .collect(Collectors.toList());
        }
        if (!dto.getSizeDtos().isEmpty()) {
            products = products.stream()
                    .filter(p -> dto.getSizeDtos().contains(p.getSize()))
                    .collect(Collectors.toList());
        }
        if (!dto.getSortDtos().isEmpty()) {
            products = products.stream()
                    .filter(p -> dto.getSortDtos().contains(p.getSort()))
                    .collect(Collectors.toList());
        }
        if (dto.getPriceDto() != null) {
            products = products.stream()
                    .filter(p -> p.getPrice() >= dto.getPriceDto().getLowerPrice() && p.getPrice() <= dto.getPriceDto().getUpperPrice())
                    .collect(Collectors.toList());
        }
        return products;
    }

    public List<Product> getRecentProducts() {
        return productRepository.findAll().stream()
                .sorted(Comparator.comparingInt(Product::getSold))
                .limit(4)
                .collect(Collectors.toList());
    }

    public Optional<Product> getProduct(String id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteDiet(String id) {
        productRepository.deleteById(id);
    }
}
