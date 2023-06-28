package com.example.springsecurity.account;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepository {
    private static Map<String, Account> store = new HashMap<>();
    private static Long id = 100L;

    public Account save(Account account) {
        account.setId(id++);
        return store.put(account.getEmail(), account);
    }

    public Account findByEmail(String username) {
        return store.get(username);
    }
}
