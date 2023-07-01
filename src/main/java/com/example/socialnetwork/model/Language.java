package com.example.socialnetwork.model;

import com.example.socialnetwork.dto.LanguageDTO;
import jakarta.persistence.*;

@Table(name = "language")
@Entity(name = "language")
@Embeddable
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Language(LanguageDTO languageDTO) {
        this.name = languageDTO.name();
    }

    public Language() {

    }
}
