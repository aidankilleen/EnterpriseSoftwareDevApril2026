package ie.pt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDrivenContextInvestigation {

    public static void main(String[] args) {

        System.out.println("Annotation Driven Example");

        ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);

        String name = ctx.getBean("name", String.class);
        System.out.println(name);

        String address = ctx.getBean("address", String.class);
        System.out.println(address);

        User u = ctx.getBean(User.class);
        System.out.println(u);

        UserService us = ctx.getBean(UserService.class);

        for (User user: us.getUsers()) {
            System.out.println(user);
        }
    }
}
