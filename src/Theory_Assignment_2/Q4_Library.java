package Theory_Assignment_2;

import java.util.ArrayList;
import java.util.List;
public class Q4_Library {
    private List<Q4_Book> books;

    // Constructor
    public Q4_Library() {
        this.books = new ArrayList<>();
    }

    // Add Book to Library
    public void addBook(Q4_Book book) {
        books.add(book);
    }

    // Borrow Book from Library
    public Q4_Book borrowBook(int bookId) {
        for (Q4_Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                return book;
            }
        }
        System.out.println("Book with ID " + bookId + " is not available!");
        return null;
    }

    // Return Book to Library
    public void returnBook(Q4_Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been returned to the library.");
    }

    // Display All Available Books
    public void displayAvailableBooks() {
        System.out.println("Available Books in the Library:");
        for (Q4_Book book : books) {
            System.out.println("  - " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
