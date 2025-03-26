package Theory_Assignment_2;
import java.util.ArrayList;
import java.util.List;
//public class Q4_LibraryManagementSystem_LibraryUser {
//}

class LibraryUser {
    private final String userId;
    private final String userName;
    private final List<Book> borrowedBooks;

    // Constructor
    public LibraryUser(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(userName + " borrowed \"" + book.getTitle() + "\".");
        } else {
            System.out.println("Sorry, \"" + book.getTitle() + "\" is already borrowed.");
        }
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(userName + " returned \"" + book.getTitle() + "\".");
        } else {
            System.out.println(userName + " did not borrow \"" + book.getTitle() + "\".");
        }
    }

    // Display Borrowed Books
    public void displayBorrowedBooks() {
        System.out.println(userName + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}




