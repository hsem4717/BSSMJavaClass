package com.example.springsecurity.account;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String authority;

    @Builder

    public Account(String email, String password, String name, String authority) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.authority = authority;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
