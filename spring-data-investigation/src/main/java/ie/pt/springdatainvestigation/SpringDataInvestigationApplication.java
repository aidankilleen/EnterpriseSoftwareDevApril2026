package ie.pt.springdatainvestigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataInvestigationApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringDataInvestigationApplication.class);

    @Value("${spring.application.name}")
    String applicationName;

    @Value("${pt.data.title}")
    String applicationTitle;

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataInvestigationApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        log.info("*****Application Starting:" + applicationName);
        System.out.println(applicationName);
        System.out.println(applicationTitle);
/*
        User u = new User("Zoe", "zoe@gmail.com", true);
        userRepository.save(u);
        u = new User("Yvonne", "yvonne@gmail.com", false);
        userRepository.save(u);
        u = new User("Xavier", "xavier@gmail.com", true);
        userRepository.save(u);
        u = new User("Wendy", "wendy@gmail.com", false);
        userRepository.save(u);
*/
        List<User> users = userRepository.findAll();

        for (User user : users) {
            System.out.println(user);
        }
    }
}
