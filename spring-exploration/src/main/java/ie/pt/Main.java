package ie.pt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Spring Exploration");


        InMemoryUserDao dao = new InMemoryUserDao();

        for (User user : dao.getUsers()) {
            System.out.println(user);
        }
        System.out.println("----------------------------------");
        User u3 = dao.getUser(3);

        System.out.println(u3);
/*
        System.out.println("---------------------------------");
        UserService svc = new UserService(dao);

        for (User user : svc.getActiveUsers()) {
            System.out.println(user);
        }
*/

    }
}