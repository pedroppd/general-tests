package generaltests.domain.usecases;

import generaltests.domain.User;

public interface ISaveUserUseCase {
    User execute(UserRequest user);
}
