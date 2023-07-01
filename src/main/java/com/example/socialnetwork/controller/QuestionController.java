package com.example.socialnetwork.controller;

import com.example.socialnetwork.dto.QuestionDTO;
import com.example.socialnetwork.model.Question;
import com.example.socialnetwork.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final QuestionRepository questionRepository;

    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @PostMapping
    public void registerQuestion(@RequestBody QuestionDTO questionDTO) {
        questionRepository.save(new Question(questionDTO));
    }
}
