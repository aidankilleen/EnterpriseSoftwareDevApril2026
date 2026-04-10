package ie.pt.springbootwebinvestigation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TemplateController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/page")
    public String getPage(Model model) {

        model.addAttribute("title",
                "User List");

        List<User> users = userRepository.findAll();


        model.addAttribute("users",
                users);

        return "page";
    }
}
