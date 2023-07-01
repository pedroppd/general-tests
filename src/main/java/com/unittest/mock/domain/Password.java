package com.unittest.mock.domain;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.regex.Pattern;

public class Password {
    private String password;

    private Password(String password) {
        this.password = password;
    }

    public static Password create(String password) {
        validate(password);
        String passwordEncrypted = encode(password);
        return new Password(passwordEncrypted);
    }

    private static void validate(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\[\\]{};':\"\\\\|,.<>/?])(?=.*\\d).{8,}$";
        if (!Pattern.compile(pattern).matcher(password).find())
            throw new RuntimeException("The password need have capital letter, lower letter and numbers");
    }

    private static String encode(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    private void setPassword(String password) {
        this.password = password;
    }
}
