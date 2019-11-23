package pl.jaszczomb.appserverside.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.jaszczomb.appserverside.repository.BrandRepository;
import pl.jaszczomb.appserverside.repository.ProductRepository;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTestSuite {

    @Autowired private ProductRepository productRepository;
    @Autowired private BrandRepository brandRepository;

    @Test
    public void shouldSaveEmptyProduct() {
//        Given
        Product product = new Product();

//        When
        productRepository.save(product);

//        Then
        String id = product.getId();
        Optional<Product> fetchedProduct = productRepository.findById(id);
        assertNotNull(fetchedProduct);
        assertEquals(id, fetchedProduct.get().getId());

//        CleanUp
        productRepository.deleteById(id);
    }
}