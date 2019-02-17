package com.sisyphus.springbootbasics.springboottutorial;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BookController {

    @GetMapping(value = "books/")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(20, "Ijapa", "lekan"), new Book(500, "ogboju ode ", "Fagunwa"));

    }
}