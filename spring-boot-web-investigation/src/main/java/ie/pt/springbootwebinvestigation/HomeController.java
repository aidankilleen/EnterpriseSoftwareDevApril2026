package ie.pt.springbootwebinvestigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    @ResponseBody
    public String users() {

        List<User> users = userRepository.findAll();

        String html = "<table><thead></thead><tbody>";

        for (User u: users) {
            html += "<tr>" +
                    "<td>" + u.getId() + "</td>" +
                    "<td>" + u.name + "</td>" +
                    "<td>" + u.email + "</td>" +
                    "<td>" + u.active + "</td>" +
                    "</tr>";
        }
        html += "</table>";

        return "<h1>Users</h1>" + html;
    }

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        // request info from db
        System.out.println("home() called");;
        return """
                <h1>Home Page</h1>
                !!!!!!!
                
                """;
    }
}
