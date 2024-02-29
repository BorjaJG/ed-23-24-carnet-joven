package org.example.user.domain;

public class CreateUserUseCase {
    private UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private void  execute(User user){
        this.userRepository.createUser(user);
    }


}
