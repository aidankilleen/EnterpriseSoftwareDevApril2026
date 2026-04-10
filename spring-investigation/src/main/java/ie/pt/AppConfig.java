package ie.pt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ie.pt")
public class AppConfig {

    @Bean("name")
    public String getName() {
        return "Alice";
    }

    @Bean("address")
    public String getAddress() {
        return "Cork";
    }

    @Bean
    public User getUser() {
        return new User(1, "Alice", "alice@gmail.com", false);
    }
}
