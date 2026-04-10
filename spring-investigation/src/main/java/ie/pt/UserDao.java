package ie.pt;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    List<User> users = new ArrayList<>();

    UserDao() {
        users.add(new User(1, "Alice", "alice@gmail.com", true));
        users.add(new User(2, "Bob", "bob@gmail.com", false));
        users.add(new User(3, "Carol", "carol@gmail.com", true));
        users.add(new User(4, "Dan", "dan@gmail.com", true));
    }
    List<User> getUsers() {
        return users;
    }

}
