package springcoretraining.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springcoretraining.user.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PostRepositoryImpl implements PostRepository {

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
}
