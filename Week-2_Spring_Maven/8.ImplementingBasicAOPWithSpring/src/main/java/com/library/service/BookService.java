package com.library.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public void addBook(String title) {
        System.out.println("Adding book: " + title);
    }

    public void deleteBook(String title) {
        System.out.println("Deleting book: " + title);
    }

    public void beforeBook(String title) {
        System.out.println("Before Executing: " + title);
    }
}

