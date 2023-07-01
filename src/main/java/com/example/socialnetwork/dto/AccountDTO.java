package com.example.socialnetwork.dto;

import com.example.socialnetwork.model.Contact;
import com.example.socialnetwork.model.Country;
import com.example.socialnetwork.model.Language;
import com.example.socialnetwork.model.Question;

public record AccountDTO(String fullName, String email, String userName, Contact contact, Country country, Language language, Question question) {
}
