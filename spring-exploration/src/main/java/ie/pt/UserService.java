package ie.pt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class UserService {

    @Autowired
    UserDao dao;

    public UserService() {
    }

    public UserService(SqliteUserDao dao) {
        this.dao = dao;
    }

    public List<User> getActiveUsers() throws SQLException {

        List<User> activeUsers = dao.getUsers()
                                    .stream()
                                    .filter(user->user.active())
                                    .toList();
        return activeUsers;
    }
}
