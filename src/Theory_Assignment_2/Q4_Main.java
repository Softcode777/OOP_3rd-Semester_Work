package Theory_Assignment_2;
//LibraryManagementSystem
public class Q4_Main {
    public static void main(String[] args) {
        // Create Library and Add Books
        Q4_Library library = new Q4_Library();
        Q4_Book book1 = new Q4_Book(101, "1984", "George Orwell");
        Q4_Book book2 = new Q4_Book(102, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Display Available Books
        library.displayAvailableBooks();

        // Create Library User
        Q4_LibraryUser user = new Q4_LibraryUser(1, "Alice");

        // Borrow a Book
        Q4_Book borrowedBook = library.borrowBook(101);
        if (borrowedBook != null) {
            user.borrowBook(borrowedBook);
        }

        // Display User's Borrowed Books
        user.displayBorrowedBooks();

        // Return a Book
        user.returnBook(borrowedBook);
        library.returnBook(borrowedBook);

        // Display Available Books Again
        library.displayAvailableBooks();
    }
}
