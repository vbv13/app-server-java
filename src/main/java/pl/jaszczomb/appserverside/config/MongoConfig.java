package pl.jaszczomb.appserverside.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    @Bean
    public MongoClient mongo() {
        return new MongoClient("localhost");
    }
}
