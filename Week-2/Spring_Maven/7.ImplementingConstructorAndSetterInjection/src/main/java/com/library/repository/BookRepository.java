package com.library.repository;

import com.library.book.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {

    private final Map<Long, Book> bookStore = new HashMap<>();
    private static long idCounter = 1;

    // Methods for CRUD operations
    public void addBook(Book book) {
        book.setId(idCounter++);
        bookStore.put(book.getId(), book);
    }

    public Book getBook(Long id) {
        return bookStore.get(id);
    }

}
