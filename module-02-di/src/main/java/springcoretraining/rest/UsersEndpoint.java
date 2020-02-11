package springcoretraining.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcoretraining.user.User;

import java.util.List;

@RestController
public class UsersEndpoint {

    @GetMapping("/users")
    public List<User> getUsers() {
        return null;
    }
}