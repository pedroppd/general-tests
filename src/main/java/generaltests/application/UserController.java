package generaltests.application;

import generaltests.domain.User;
import generaltests.domain.usecases.ISaveUserUseCase;
import generaltests.domain.usecases.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final ISaveUserUseCase saveUserUseCase;

    public UserController(ISaveUserUseCase ISaveUserUseCase) {
        this.saveUserUseCase = ISaveUserUseCase;
    }

    @PostMapping
    public ResponseEntity<UserDTO> saveUser(UserRequest userRequest) {
        User user = this.saveUserUseCase.execute(userRequest);
        UserDTO userDTO = user.toDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
    }
}
