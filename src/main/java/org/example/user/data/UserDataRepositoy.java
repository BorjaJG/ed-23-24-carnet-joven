package org.example.user.data;

import org.example.user.domain.User;
import org.example.user.domain.UserRepository;

public class UserDataRepositoy  implements UserRepository {
    @Override
    public User obtainUser(String nif) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }
}
