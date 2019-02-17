package com.example.postgresdemo.repository;

import java.util.List;

import com.example.postgresdemo.model.Answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AnswerRepository
 */
@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{

    public List<Answer> findByQuestionId(Long id);
    
}