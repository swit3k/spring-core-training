package springcoretraining.user;

import java.util.Collections;
import java.util.List;

public class UserRepositoryDbImpl implements UserRepository {
    @Override
    public List<User> getUsers() {
        return Collections.singletonList(new User("Jan", "Nowak", 36));
    }
}
