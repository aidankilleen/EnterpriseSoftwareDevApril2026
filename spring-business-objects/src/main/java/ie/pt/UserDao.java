package ie.pt;

import java.util.List;

public interface UserDao {

    List<User> getUsers();
    User getUser(int id);
    User addUser(User user); // returned user will include the assigned id
    User updateUser(User user);
    void deleteUser(int id);
}
