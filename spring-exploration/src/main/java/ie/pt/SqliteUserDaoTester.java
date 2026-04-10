package ie.pt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;


public class SqliteUserDaoTester {

    public static void main(String[] args) throws SQLException {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        SqliteUserDao dao = ctx.getBean(SqliteUserDao.class);

        List<User> users = dao.getUsers();

        for (User user : users) {
            System.out.println(user);
        }
    }


}
