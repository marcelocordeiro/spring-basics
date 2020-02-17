package com.monitoratec.springbasics.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {
    private static Logger LOGGER = LogManager.getLogger(RestApi.class);

    @GetMapping(value = "/books")
    public void getBooks() {
        LOGGER.info("Get books");
    }

    @GetMapping(value = "/books/{id}")
    public void getBookById(@PathVariable("id") Long bookId) {
        LOGGER.info("Get book {}", bookId);
    }

    @GetMapping(value = "/authors")
    public void getAuthors() {
        LOGGER.info("Get authors");
    }

    @GetMapping(value = "/authors/{id}")
    public void getAuthorById(@PathVariable("id") Long authorId) {
        LOGGER.info("Get author {}", authorId);
    }
}
