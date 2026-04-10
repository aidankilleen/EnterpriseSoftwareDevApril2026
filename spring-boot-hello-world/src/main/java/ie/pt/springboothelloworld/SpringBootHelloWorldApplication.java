package ie.pt.springboothelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootHelloWorldApplication implements CommandLineRunner {

    @Autowired
    String message;

    @Autowired
    UserService userService;

    ApplicationContext ctx;

    // Constructor Injection
    public SpringBootHelloWorldApplication(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        for (User u : userService.getActiveUsers()) {

            System.out.println(u);
        }


        // our code goes here....
        System.out.println(message);
/*
        UserDao dao = ctx.getBean(UserDao.class);

        for (User u : dao.getUsers()) {
            System.out.println(u);
        }

 */
/*
        User u = ctx.getBean(User.class);

        System.out.println(u);

 */
    }
}
