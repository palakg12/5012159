package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to perform service operations
    public void performService() {
        System.out.println("Performing book service...");

        // Example of using bookRepository
        if (bookRepository != null) {
            bookRepository.fetchBooks();
        } else {
            System.out.println("BookRepository is not set!");
        }
    }
}
