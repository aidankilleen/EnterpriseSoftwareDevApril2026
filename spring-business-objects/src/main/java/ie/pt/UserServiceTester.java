package ie.pt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserServiceTester {

    public static void main(String[] args) {
        System.out.println("User Service Tests");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService us = ctx.getBean(UserService.class);

        for (User user : us.getActiveUsers()) {
            System.out.println(user);
        }

    }
}
