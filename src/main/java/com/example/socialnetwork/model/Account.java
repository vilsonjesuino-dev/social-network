package com.example.socialnetwork.model;

import com.example.socialnetwork.dto.AccountDTO;
import jakarta.persistence.*;

@Table(name = "account")
@Entity(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String userName;

    @OneToOne
    private Contact contact;
    @OneToOne
    private Country country;
    @OneToOne
    private Language language;
    @OneToOne
    private Question question;

    public Account(AccountDTO accountDTO) {
        this.fullName = accountDTO.fullName();
        this.email = accountDTO.email();
        this.userName = accountDTO.userName();
        this.contact = accountDTO.contact();
        this.country = accountDTO.country();
        this.language = accountDTO.language();
        this.question = accountDTO.question();
    }

    public Account() {

    }
}
