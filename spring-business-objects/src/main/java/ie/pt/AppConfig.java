package ie.pt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@ComponentScan("ie.pt")
public class AppConfig {

    @Bean
    Connection getConnection() throws SQLException {

        String url = "jdbc:sqlite:C:\\work\\training\\java\\users.db";
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }

}
