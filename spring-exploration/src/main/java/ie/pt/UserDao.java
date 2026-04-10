package ie.pt;

import java.util.List;

public interface UserDao {
    public List<User> getUsers();
    public User getUser(int id);
    public User updateUser(User user);
    public User addUser(User user);
    public void deleteUser(int id);
}
