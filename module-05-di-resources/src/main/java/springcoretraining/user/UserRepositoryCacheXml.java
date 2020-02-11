package springcoretraining.user;

import java.util.Collections;
import java.util.List;

public class UserRepositoryCacheXml implements UserRepository {

    @Override
    public List<User> getUsers() {
        return Collections.singletonList(new User("Jan", "Kowalski", 24));
    }
}
