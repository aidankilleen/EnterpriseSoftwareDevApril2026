package ie.pt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Spring Framework Investigation");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        String s = ctx.getBean(String.class);

        System.out.println(s);

        User u = ctx.getBean(User.class);

        System.out.println(u);

        // UserService us = new UserService();
        UserService us = ctx.getBean(UserService.class);

        for (User user : us.getUsers()) {

            System.out.println(user);
        }

    }
}