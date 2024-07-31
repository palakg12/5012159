package LiabraryManagementSystem;

import java.util.Arrays;
import java.util.List;

public class LibraryManagementSystemDemo {
        public static <List> void main(String[] args) {
            List books = (List) Arrays.asList(
                    new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
                    new Book("B002", "1984", "George Orwell"),
                    new Book("B003", "To Kill a Mockingbird", "Harper Lee"),
                    new Book("B004", "Pride and Prejudice", "Jane Austen"),
                    new Book("B005", "The Catcher in the Rye", "J.D. Salinger")
            );

            Library library = new Library((java.util.List<Book>) books);

            System.out.println("Linear Search for '1984':");
            Book book1 = library.linearSearchByTitle("1984");
            System.out.println(book1 != null ? book1 : "Book not found");

            System.out.println("\nBinary Search for 'Pride and Prejudice':");
            Book book2 = library.binarySearchByTitle("Pride and Prejudice");
            System.out.println(book2 != null ? book2 : "Book not found");
        }
}
