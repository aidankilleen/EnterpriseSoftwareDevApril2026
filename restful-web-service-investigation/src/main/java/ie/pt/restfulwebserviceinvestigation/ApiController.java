package ie.pt.restfulwebserviceinvestigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class ApiController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {

        return ResponseEntity.of(userRepository.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User addedUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED)
                            .body(addedUser);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id,
                           @RequestBody User user) {

        User userToChange = userRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        userToChange.setName(user.getName());
        userToChange.setEmail(user.getEmail());
        userToChange.setActive(user.isActive());

        userRepository.save(userToChange);

        return userToChange;
    }
}
