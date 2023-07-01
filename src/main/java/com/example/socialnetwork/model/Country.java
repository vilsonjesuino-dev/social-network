package com.example.socialnetwork.model;

import jakarta.persistence.*;

@Table(name = "country")
@Entity(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String population;
    private String capital;
}
