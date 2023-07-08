package generaltests.domain;

import generaltests.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

@SpringBootTest
public class UserTest {

    @DisplayName("Should create a user")
    @Test
    public void shouldCreateUser() {
        User user = User.create("Pedro",
                "Dantas",
                LocalDate.of(1997, 12, 20),
                "12546353728",
                "Teste@20121997",
                "pedro@hotmail.com");

        Assertions.assertNotNull(user.getUuid());
        assertNotNull(user.getDtCreation());
    }

    @DisplayName("Shouldn't create a user, email is incorrect")
    @Test
    public void shouldNotCreateAUserEmailIsIncorrect() {
        assertThrows(RuntimeException.class, () -> User.create("Pedro",
                "Dantas",
                LocalDate.of(1997, 12, 20),
                "12546353728",
                "Teste@20121997",
                "pedro.com"));
    }

    @DisplayName("Shouldn't create a user, CPF is incorrect")
    @Test
    public void shouldNotCreateAUserCPFIsIncorrect() {
        assertThrows(RuntimeException.class, () -> User.create("Pedro",
                "Dantas",
                LocalDate.of(1997, 12, 20),
                "1254635372823232323",
                "Teste@20121997",
                "pedro@hotmail.com"));
    }

    @DisplayName("Shouldn't create a user, password is incorrect")
    @Test
    public void shouldNotCreateAUserPasswordIsIncorrect() {
        assertThrows(RuntimeException.class, () -> User.create("Pedro",
                "Dantas",
                LocalDate.of(1997, 12, 20),
                "1254635372823232323",
                "1234",
                "pedro@hotmail.com"));
    }
}
