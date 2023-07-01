package com.example.socialnetwork.controller;

import com.example.socialnetwork.dto.LanguageDTO;
import com.example.socialnetwork.model.Language;
import com.example.socialnetwork.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageController {

    private final LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @PostMapping
    public void registerLanguage(@RequestBody LanguageDTO languageDTO) {
        languageRepository.save(new Language(languageDTO));
    }
}
