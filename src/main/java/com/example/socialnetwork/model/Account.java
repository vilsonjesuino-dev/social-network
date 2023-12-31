package com.example.socialnetwork.model;

import com.example.socialnetwork.dto.AccountDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String userName;

    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;
    @OneToOne(cascade = CascadeType.ALL)
    private Country country;
    @OneToOne(cascade = CascadeType.ALL)
    private Language language;
    @OneToOne(cascade = CascadeType.ALL)
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
