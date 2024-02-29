package org.example.user.domain;

public interface UserRepository  {
    User obtainUser(String nif);

    void createUser(User user);
}
