package com.example.socialnetwork.model;

import jakarta.persistence.*;

@Table(name = "language")
@Entity(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
