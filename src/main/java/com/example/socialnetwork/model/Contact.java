package com.example.socialnetwork.model;

import com.example.socialnetwork.dto.ContactDTO;
import com.example.socialnetwork.enums.Type;
import jakarta.persistence.*;

@Table(name = "contact")
@Entity(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;

    private String ddd;
    private String number;

    public Contact(ContactDTO contactDTO) {
        this.type = Type.valueOf(contactDTO.type());
        this.ddd = contactDTO.ddd();
        this.number = contactDTO.number();
    }

    public Contact() {

    }
}
