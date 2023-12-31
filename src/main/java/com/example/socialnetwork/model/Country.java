package com.example.socialnetwork.model;

import com.example.socialnetwork.dto.CountryDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String population;
    private String capital;

    public Country(CountryDTO countryDTO) {
        this.name = countryDTO.name();
        this.population = countryDTO.population();
        this.capital = countryDTO.capital();
    }

    public Country() {

    }
}
