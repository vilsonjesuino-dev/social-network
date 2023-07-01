package com.example.socialnetwork.controller;

import com.example.socialnetwork.dto.CountryDTO;
import com.example.socialnetwork.model.Country;
import com.example.socialnetwork.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryRepository countryRepository;

    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PostMapping
    public void registerCountry(@RequestBody CountryDTO countryDTO) {
        countryRepository.save(new Country(countryDTO));
    }
}
