package com.hexaware.codingchallenge;

import static org.mockito.Mockito.mock;

import org.springframework.context.annotation.Bean;

import com.hexaware.codingchallenge.service.BookService;

public class TestConfig {
	@Bean
    public BookService bookService() {
        return mock(BookService.class);
    }
}
