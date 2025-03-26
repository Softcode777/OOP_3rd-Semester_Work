package Theory_Assignment_2;
//public class Q4_LibraryManagementSystem_Library {
//}
import java.util.ArrayList;
import java.util.List;

class Library {
    private final List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            book.displayBook();
        }
    }

    // Find a book by its ID
    public Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null; // Book not found
    }
}
