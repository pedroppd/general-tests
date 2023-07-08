package generaltests.infra;


import generaltests.application.UserController;
import generaltests.domain.usecases.SaveUserUseCaseFake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntryPointApplication {

    @Bean
    public UserController startUserController() {
        return new UserController(new SaveUserUseCaseFake());
    }
}
