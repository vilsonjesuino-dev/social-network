package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
