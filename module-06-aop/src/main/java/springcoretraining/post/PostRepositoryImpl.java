package springcoretraining.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springcoretraining.SpringCoreTraingingConfig;
import springcoretraining.aop.Useless;
import springcoretraining.user.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PostRepositoryImpl implements PostRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(PostRepositoryImpl.class);

    private UserRepository userRepository;

    @Autowired
    public PostRepositoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Post> getPosts() {
        return userRepository.getUsers().stream()
                .map(Post::new)
                .collect(Collectors.toList());
    }

    @Override
    @Useless
    public void submit() {
        LOGGER.info("Submitting very important post!");
    }
}
