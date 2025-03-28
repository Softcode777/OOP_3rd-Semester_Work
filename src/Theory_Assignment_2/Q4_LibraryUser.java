package Theory_Assignment_2;
import java.util.ArrayList;
import java.util.List;

public class Q4_LibraryUser {
    private int userId;
    private String userName;
    private List<Q4_Book> borrowedBooks;

    public Q4_LibraryUser(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.borrowedBooks = new ArrayList<>();
    }
    // Method to Borrow Book
    public void borrowBook(Q4_Book book) {
        borrowedBooks.add(book);
        System.out.println(userName + " borrowed: " + book.getTitle());
    }
    // Method to Return Book
    public void returnBook(Q4_Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(userName + " returned: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " not found in borrowed list!");
        }
    }
    // Display Borrowed Books
    public void displayBorrowedBooks() {
        System.out.println(userName + "'s Borrowed Books:");
        for (Q4_Book book : borrowedBooks) {
            System.out.println("  - " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}