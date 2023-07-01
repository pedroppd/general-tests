package com.unittest.mock.domain;

import static java.util.Objects.isNull;
import static org.apache.logging.log4j.util.Strings.isEmpty;

public class CPF {
    private String cpf;

    public static CPF create(String cpf) {
        validateCPF(cpf);
        return new CPF(cpf);
    }

    private CPF(String cpf) {
        this.cpf = cpf;
    }

    private static void validateCPF(String cpf) {
        if (isNull(cpf) || isEmpty(cpf))
            throw new RuntimeException("CPF was note inserted");

        if (!cpf.matches("\\d{11}"))
            throw new RuntimeException("CPF is invalid");
    }

    private String getCPFFormatted() {
        return this.getCPFUnformatted().replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public String getCPFUnformatted() {
        return this.cpf;
    }
}
