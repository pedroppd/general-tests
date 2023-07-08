package generaltests.application;

import generaltests.domain.CPF;
import generaltests.domain.Email;
import generaltests.domain.Password;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDTO {
    private String uuid;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Email email;
    private LocalDateTime dtCreation;

    public UserDTO(String uuid, String firstName, String lastName, LocalDate birthDate, Email email, LocalDateTime dtCreation) {
        this.birthDate = birthDate;
        this.dtCreation = dtCreation;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = uuid;
    }
}
