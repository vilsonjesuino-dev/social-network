package com.example.socialnetwork.controller;

import com.example.socialnetwork.dto.ContactDTO;
import com.example.socialnetwork.model.Contact;
import com.example.socialnetwork.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    @PostMapping
    public void registerContact(@RequestBody ContactDTO contactDTO) {
        contactRepository.save(new Contact(contactDTO));
    }
}
