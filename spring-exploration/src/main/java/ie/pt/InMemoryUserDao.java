package ie.pt;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class InMemoryUserDao implements UserDao {

    List<User> users = new ArrayList<>();

    InMemoryUserDao() {
        users.add(new User(1, "Alice", "alice@gmail.com", true));
        users.add(new User(2, "Bob", "bob@gmail.com", false));
        users.add(new User(3, "Carol", "carol@gmail.com", true));
        users.add(new User(4, "Dan", "dan@gmail.com", true));
    }
    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        User foundUser = users.stream().filter(user -> user.id() == id)
                                        .findFirst()
                                        .orElse(null);
        return foundUser;
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
