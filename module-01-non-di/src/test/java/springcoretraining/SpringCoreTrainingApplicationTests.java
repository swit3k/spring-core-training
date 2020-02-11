package springcoretraining;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import springcoretraining.user.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringCoreTrainingApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void collectionOfUsersShouldContainOneUser() throws Exception {
		// arrange
		String usersUrl = "http://localhost:" + port + "/users";

		// act
		List<User> resource = this.restTemplate.getForObject(usersUrl, List.class);

		// assert
		assertThat(resource).extracting("firstName").containsExactly("Jan");
	}
}