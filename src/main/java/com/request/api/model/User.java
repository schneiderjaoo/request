package com.request.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String password;

    public User(String name, String pass) {
        this.name = name;
        this.password = pass;
    }

    public static User createUser(String name, String pass) {
        return new User(name, pass);
    }

    public static void printUser(@NotNull User user) {
        System.out.println( " Id: "+user.getId() +
                            "\n Name: "+user.getName() +
                            "\n Password: "+user.getPassword());
    }
}

