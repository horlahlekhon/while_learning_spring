package com.example.postgresdemo.contoller;

import com.example.postgresdemo.exception.ResourceNotFoundException;
import javax.validation.Valid;

import com.example.postgresdemo.model.Question;
import com.example.postgresdemo.repository.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

/**
 * QuestionController
 */
@RestController
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    // a Page class allow for pagination
    @GetMapping("/questions")
    public Page<Question> getQuestion(Pageable pageable) {

        return questionRepository.findAll(pageable);
    }
    @GetMapping("/questions/{questionId}")
    public Question getQuestion(@PathVariable Long questionId) {
        return questionRepository.findById(questionId)
        .orElseThrow(() -> new ResourceNotFoundException("The Question with the specified id " + questionId +" not found"));
    }

    @PostMapping("/questions")
    public Question createQuestion(@Valid @RequestBody Question question) {

        return questionRepository.save(question);
    }

    @PutMapping("/questions/{questionId}")
    public Question updateQuestion(@PathVariable Long questionId, @Valid @RequestBody Question updatedQuestion) {

        return questionRepository.findById(questionId).map(question -> {
            question.setTitle(updatedQuestion.getTitle());
            question.setDescription(updatedQuestion.getDescription());
            return questionRepository.save(question);
        }).orElseThrow(() -> new ResourceNotFoundException("question not found with id" + questionId));
    }

    // ResponseEntity represents the whole HTTP response: status code,
    // headers, and body. Because of it, we can use it to fully configure the HTTP
    // response.
    @DeleteMapping("/questions/{questionId}")
    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId) {
        return questionRepository.findById(questionId).map(question -> {
            questionRepository.delete(question);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("question not found with id" + questionId));

    }
}