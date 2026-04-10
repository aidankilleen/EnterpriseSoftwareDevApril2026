package ie.pt.springboothelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class AppConfig {

    @Bean
    Connection getConnection() throws SQLException {

        String url = "jdbc:sqlite:C:\\work\\training\\java\\users.db";
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }

    @Bean
    String getMessage() {
        return "This is a spring string";
    }

    @Bean
    User getUser() {
        return new User(1,
                "Karen",
                "karen",
                true);
    }
}
