package com.unittest.mock.domain;

import java.util.regex.Pattern;

public class Email {
    private String email;

    private Email(String email) {
        this.email = email;
    }

    public static Email create(String email) {
        validate(email);
        return new Email(email);
    }

    private static void validate(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(!Pattern.compile(emailRegex).matcher(email).find())
            throw new RuntimeException("Email is invalid");
    }
}
