package com.example.springsecurity.account;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountController {
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/create")
    public Account create(){
        Account account = Account.builder()
                .email("teacher@gmail.com")
                .password(passwordEncoder.encode("1234"))
                .name("mrchoi")
                .authority("ROLE_USER")
                .build();
        System.out.println(account.getPassword());
        return  accountRepository.save(account);
    }
}
