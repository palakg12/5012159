package com.library;


import com.library.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryManagementApplicationTest {

    @Test
    public void testAOP() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);

        assertNotNull(bookService, "BookService bean should not be null");

        // Call a method on bookService to trigger logging aspect
        bookService.someServiceMethod();
    }
}
