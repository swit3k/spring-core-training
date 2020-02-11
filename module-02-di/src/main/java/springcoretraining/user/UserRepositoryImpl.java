package springcoretraining.user;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getUsers() {
        return Collections.singletonList(new User("Jan", "Kowalski", 24));
    }
}
