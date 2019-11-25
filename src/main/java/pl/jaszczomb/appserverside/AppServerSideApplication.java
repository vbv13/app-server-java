package pl.jaszczomb.appserverside;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.jaszczomb.appserverside.collection.Product;

@SpringBootApplication
public class AppServerSideApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppServerSideApplication.class, args);
		Product product = new Product();
		product.getName();
	}

}
