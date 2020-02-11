package springcoretraining.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springcoretraining.SpringCoreTraingingConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.List;

public class UserRepositoryImplXml implements UserRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryImplXml.class);

    @Override
    public List<User> getUsers() {
        return Collections.singletonList(new User("Jan", "Kowalski", 24));
    }

    @PostConstruct
    public void init() {
        LOGGER.info("PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        LOGGER.info("PreDestroy");
    }
}
