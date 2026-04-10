package ie.pt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class SpringMain {

    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        //UserService svc = new UserService(dao);
        UserService svc = ctx.getBean(UserService.class);

        for (User user : svc.getActiveUsers()) {
            System.out.println(user);
        }
    }
}
