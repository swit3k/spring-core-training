package springcoretraining.post;

import springcoretraining.user.User;

import java.time.LocalDateTime;

public class Post {
    private User user;
    private LocalDateTime createdAt;

    public Post(User user) {
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
