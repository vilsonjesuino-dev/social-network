package com.example.socialnetwork.model;

import com.example.socialnetwork.enums.Question;
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
    private Contact phoneNumber;
    @OneToOne
    private Country country;
    @OneToOne
    private Language language;

    @Enumerated(EnumType.STRING)
    private Question question;
}
