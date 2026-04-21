package ie.pt.restfulwebserviceinvestigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model) {

        List<User> users = userRepository.findAll();
        //System.out.println(users);0

        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("about")
    public String about() {
        return "about";
    }
    @GetMapping("contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("users")
    public String users(Model model) {

        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("ajaxinvestigation")
    public String ajaxinvestigation() {
        return "ajaxinvestigation";
    }

    @GetMapping("javascriptinvestigation")
    public String javascriptinvestigation() {
        return "javascriptinvestigation";
    }

}
