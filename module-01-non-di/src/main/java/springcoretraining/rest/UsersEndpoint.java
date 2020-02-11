package springcoretraining.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcoretraining.user.User;

import java.util.Collections;
import java.util.List;

@RestController
public class UsersEndpoint {

    @GetMapping("/users")
    public List<User> getUsers() {
        User user = new User("Jan", "Kowalski", 82);

        return Collections.singletonList(user);
    }
}

