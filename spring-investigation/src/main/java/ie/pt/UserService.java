package ie.pt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserService {

    @Autowired
    UserDao dao;

    public UserService() {
    }

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public List<User> getUsers() {

        return dao.getUsers();
    }
}
