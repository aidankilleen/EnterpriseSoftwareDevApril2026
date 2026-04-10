package ie.pt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Business Objects Investigation");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        UserDao dao = ctx.getBean(UserDao.class);

        User newUser = new User(-1,"NEW", "new.user@gmail.com", false);

        System.out.println(newUser);
        // added user should include the id.
        User addedUser = dao.addUser(newUser);
        System.out.println(addedUser);
        System.out.println("--------------------------------------");

        dao.deleteUser(124);

        for (User user : dao.getUsers()) {
            System.out.println(user);
        }

        System.out.println("-----------------------------");
        User u = dao.getUser(61);
        System.out.println(u);

        User changedUser = new User(u.id(),
                            "CHANGED",
                            "changed@gmail.com",
                            !u.active());
        dao.updateUser(changedUser);

        u = dao.getUser(61);
        System.out.println(u);

        /*
        Connection conn = ctx.getBean(Connection.class);
        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM users";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            System.out.println(rs.getString("name"));
        }

         */


    }
}