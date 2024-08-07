package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean from the context
        BookService bookService = context.getBean(BookService.class);
        System.out.println("BookService bean has been created: " + (bookService != null));

        // Retrieve the BookRepository bean from the context
        BookRepository bookRepository = context.getBean(BookRepository.class);
        System.out.println("BookRepository bean has been created: " + (bookRepository != null));
    }
}
