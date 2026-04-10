package ie.pt;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class InMemoryUserDao implements UserDao {

    List<User> users = new ArrayList<>();

    public InMemoryUserDao() {
        users.add(new User(1, "Alice", "alice@gmail.com", true));
        users.add(new User(2, "Bob", "bob@gmail.com", false));
        users.add(new User(3, "Carol", "carol@gmail.com", true));
        users.add(new User(4, "Dan", "dan@gmail.com", true));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
