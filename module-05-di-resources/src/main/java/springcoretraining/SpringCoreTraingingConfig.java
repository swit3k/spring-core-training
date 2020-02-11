package springcoretraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springcoretraining.user.UserRepository;
import springcoretraining.user.UserRepositoryCacheXml;
import springcoretraining.user.UserRepositoryDbImpl;

@Configuration
public class SpringCoreTraingingConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreTraingingConfig.class);

    @Value("${defaultUserRepository}")
    private String defaultUserRepository;

    @Bean
    public UserRepository createUserRepository() {
        if ("cache".equals(defaultUserRepository)) {
            return new UserRepositoryCacheXml();
        }
        return new UserRepositoryDbImpl();
    }
}
