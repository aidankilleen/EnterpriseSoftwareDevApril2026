package ie.pt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class SqliteUserDao implements UserDao {

    @Autowired
    Connection conn;
    public SqliteUserDao() {
        //conn = DriverManger.getConn
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                boolean active = rs.getBoolean("active");

                User user = new User(id, name, email, active);
                users.add(user);
            }

            rs.close();
            stmt.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return users;
    }

    public User getUser(int id) {
        return new User(id, "", "", false);
    }

    public User updateUser(User user) {
        // TODO update the user object in the storage
        return user;
    }
    public User addUser(User user) {
        // TODO add the user to the storage
        return user;
    }
    public void deleteUser(int id) {
        // TODO delete the user from the storage
    }
}
