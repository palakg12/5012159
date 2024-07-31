package LiabraryManagementSystem;

// Library.java
import java.util.List;

// Library.java
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
        Collections.sort(this.books); // Ensure books are sorted for binary search
    }

    /**
     * Linear search to find a book by its title.
     *
     * @param title The title of the book to search for.
     * @return The Book object if found, otherwise null.
     */
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    /**
     * Binary search to find a book by its title.
     *
     * @param title The title of the book to search for.
     * @return The Book object if found, otherwise null.
     */
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);

            int comparison = title.compareToIgnoreCase(midBook.getTitle());
            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Book not found
    }

    /**
     * Get all books in the library.
     *
     * @return The list of books.
     */
    public List<Book> getBooks() {
        return books;
    }
}
