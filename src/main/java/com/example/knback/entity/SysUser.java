package com.example.knback.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class SysUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String email;
    private String password;
    private String avatar;
    private String nickname;

    public
    SysUser() {
    }

    public
    SysUser(String email, String password, String avatar, String nickname) {
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.nickname = nickname;
    }
}
