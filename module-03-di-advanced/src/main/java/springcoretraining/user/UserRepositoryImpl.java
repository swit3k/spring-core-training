package springcoretraining.user;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
@Qualifier("db")
@Primary
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getUsers() {
        return Collections.singletonList(new User("Jan", "Nowak", 36));
    }
}
