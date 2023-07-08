package generaltests.domain.usecases;

import generaltests.domain.User;

import java.time.LocalDate;

public class SaveUserUseCaseFake implements ISaveUserUseCase {

    public SaveUserUseCaseFake () {

    }
    @Override
    public User execute(UserRequest user) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User Save Successfully");
        return User.create("João",
                "Teste",
                LocalDate.of(1970, 6, 12),
                "12516576892",
                "Joao@1234",
                "joao@hotmail.com");
    }
}
