package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.service.BookService;
import com.library.config.AppConfig;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BookService bookService = context.getBean(BookService.class);

        // Call methods to see the aspect in action
        bookService.beforeBook("addbook");
        bookService.addBook("Spring in Action");
        bookService.deleteBook("addbook");
    }
}
