package com.example.socialnetwork.controller;

import com.example.socialnetwork.dto.AccountDTO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostMapping
    public void registerAccount(@RequestBody AccountDTO accountDTO) {
        accountRepository.save(new Account(accountDTO));
    }
}
