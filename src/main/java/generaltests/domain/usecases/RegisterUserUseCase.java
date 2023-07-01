package generaltests.domain.usecases;

import generaltests.domain.User;

public interface RegisterUserUseCase {
    User execute(UserRequest user);
}
