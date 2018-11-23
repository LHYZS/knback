package com.example.knback.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUser {
    private String email;
    private String password;

    public
    LoginUser() {
    }

    public
    LoginUser(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
