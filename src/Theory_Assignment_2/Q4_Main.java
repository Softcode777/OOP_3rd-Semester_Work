package Theory_Assignment_2;
//LibraryManagementSystem
public class Q4_Main {
    public static void main(String[] args) {
        Q4_Library library = new Q4_Library();
        Q4_Book book1 = new Q4_Book(101, "Atomic Habits", "James clear");
        Q4_Book book2 = new Q4_Book(102, "Rich Dad Poor Dad", "Robert");
        library.addBook(book1);
        library.addBook(book2);

        library.displayAvailableBooks();

        // Create Library User
        Q4_LibraryUser user = new Q4_LibraryUser(1, "Ikram");

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

        library.displayAvailableBooks();

        System.out.println("Author: " + "Ikram Niazi " + "Roll no: 085");
    }
}
