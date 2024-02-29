package org.example.user.domain;

public class User {
    private final String nif;
    private final String firstName;
    private final String lastName;
    private final String address;

    public User(String nif, String firstName, String lastName, String address) {
        this.nif = nif;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getters
    public String getNif() {
        return nif;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
}
