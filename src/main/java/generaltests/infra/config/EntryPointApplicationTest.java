package generaltests.infra.config;


import generaltests.application.UserController;
import generaltests.domain.usecases.SaveUserUseCaseFake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntryPointApplicationTest {

    @Bean(name = "startUserControllerTest")
    public UserController startUserControllerTest() {
        return new UserController(new SaveUserUseCaseFake());
    }
}
