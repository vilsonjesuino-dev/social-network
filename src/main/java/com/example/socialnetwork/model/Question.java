package com.example.socialnetwork.model;

import com.example.socialnetwork.dto.QuestionDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question01;
    private String question02;
    private String question03;

    public Question(QuestionDTO questionDTO) {
        this.question01 = questionDTO.question01();
        this.question02 = questionDTO.question02();
        this.question03 = questionDTO.question03();
    }

    public Question() {

    }
}
