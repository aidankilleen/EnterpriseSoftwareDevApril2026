package ie.pt.springboothelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class UserService {
    @Autowired
    UserDao dao;

    List<User> getActiveUsers() {

        List<User> users = dao.getUsers();

        List<User> activeUsers = users.stream()
                .filter(user -> user.active())
                .toList();

        return activeUsers;
    }
}
