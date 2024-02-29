package org.example.user.domain;

public class GetUserUseCase {

    private UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private  User execute(String nif){

        return  this.userRepository.obtainUser(nif);

    }


}
