package springcoretraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import springcoretraining.user.UserRepository;
import springcoretraining.user.UserRepositoryImplXml;

@Configuration
public class SpringCoreTraingingConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreTraingingConfig.class);

    @Bean
    @Qualifier("cache")
    @RequestScope
    public UserRepository createUserRepository() {
        LOGGER.info("new UserRepository created");
        return new UserRepositoryImplXml();
    }
}
