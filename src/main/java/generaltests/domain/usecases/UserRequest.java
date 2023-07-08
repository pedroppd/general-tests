package generaltests.domain.usecases;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Builder
public class UserRequest {
    private String firstName;
    private String lastName;
    private String CPF;
    private String password;
    private LocalDate birthDate;
    private LocalDate dtCreation;
    private String email;
}
