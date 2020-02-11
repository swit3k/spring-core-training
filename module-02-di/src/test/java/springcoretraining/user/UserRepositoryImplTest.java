package springcoretraining.user;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryImplTest {

    @Test
    void shouldVerifyUserRepositoryImpl() {
        // arrange
        UserRepositoryImpl repo = new UserRepositoryImpl();

        // act
        List<User> users = repo.getUsers();

        // assert
        assertThat(users).hasSize(1);
    }
}