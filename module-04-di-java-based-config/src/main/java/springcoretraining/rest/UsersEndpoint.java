package springcoretraining.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springcoretraining.post.Post;
import springcoretraining.post.PostRepository;
import springcoretraining.user.User;
import springcoretraining.user.UserRepository;

import javax.ws.rs.QueryParam;
import java.util.List;

@RestController
public class UsersEndpoint {

    @Autowired
    @Qualifier("db")
    private UserRepository dbRepository;

    @Autowired
    @Qualifier("cache")
    private UserRepository cacheRepository;

    private PostRepository postRepository;

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers(@QueryParam("repository") String repository) {
        if ("db".equals(repository)) {
            return dbRepository.getUsers();
        } else if ("cache".equals(repository)) {
            return cacheRepository.getUsers();
        }
        throw new IllegalArgumentException("Please provide valid repository name.");
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postRepository.getPosts();
    }
}

