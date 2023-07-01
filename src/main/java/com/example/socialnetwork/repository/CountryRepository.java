package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
