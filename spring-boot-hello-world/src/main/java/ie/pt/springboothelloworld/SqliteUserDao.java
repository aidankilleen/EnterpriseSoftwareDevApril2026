package ie.pt.springboothelloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class SqliteUserDao implements UserDao {

    @Autowired
    Connection conn;

    @Override
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
        /*
        return List.of(new User(1, "Zoe", "zoe@gmail.com", true),
                        new User(2, "Yvonne", "yvonne@gmail.com", true));

         */

    }

    @Override
    public User getUser(int id) {
        User user = null;
        String sql = "SELECT * FROM users WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                boolean active = rs.getBoolean("active");
                user = new User(id, name, email, active);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public User addUser(User user) {

        User addedUser = null;
        String sql = "INSERT INTO users (name, email, active) VALUES(?, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.name());
            stmt.setString(2, user.email());
            stmt.setBoolean(3, user.active());

            stmt.execute();
            // retrieve the newly created id
            ResultSet rs = stmt.getGeneratedKeys();
            int addedId = rs.getInt(1);

            addedUser = new User(addedId,
                                user.name(),
                                user.email(),
                                user.active());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return addedUser;
    }

    @Override
    public User updateUser(User user) {
        String sql = "UPDATE users SET name=?, email=?, active=? WHERE id=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.name());
            stmt.setString(2, user.email());
            stmt.setBoolean(3, user.active());
            stmt.setInt(4, user.id());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }

    @Override
    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
