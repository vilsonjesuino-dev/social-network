package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
