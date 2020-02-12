package springcoretraining.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UselessAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(UselessAspect.class);

    @Pointcut("execution(* submit())")
    private void makeSomeNoizPointcut() {}

    @Before("springcoretraining.aop.UselessAspect.makeSomeNoizPointcut() && " +
            "@annotation(springcoretraining.aop.Useless)")
    public void makeSomeNoiz() throws Throwable {
        LOGGER.info("Make some noizz");
    }
}
