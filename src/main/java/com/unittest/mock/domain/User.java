package com.unittest.mock.domain;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private String uuid;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Password password;
    private Email email;
    private CPF cpf;
    private LocalDateTime dtCreation;

    private User(String firstName, String lastName, LocalDate birthDate, String cpf, String password, String email) {
        this.uuid = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = CPF.create(cpf);
        this.password = Password.create(password);
        this.birthDate = birthDate;
        this.dtCreation = LocalDateTime.now();
        this.email = Email.create(email);
    }

    public static User create(String firstName, String lastName, LocalDate birthDate, String cpf, String password, String email) {
        return new User(firstName, lastName, birthDate, cpf, password, email);
    }

    public String getUuid() {
        return this.uuid;
    }

    public LocalDateTime getDtCreation() {
        return this.dtCreation;
    }
}
