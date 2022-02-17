package com.example.firebase;

import java.util.stream.Stream;

public class User {
    public String phone;
    public String password;
    public String email;

    public User(String phone, String email, String password)
    {
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
}
