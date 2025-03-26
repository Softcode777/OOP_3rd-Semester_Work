package Theory_Assignment_2;

public class Q4_LibraryManagementSystem_Main {
    public static void main(String[] args) {
        // Create a Library
        Library library = new Library();

        // Add books to the Library
        Book book1 = new Book("B101", "The Java Handbook", "Patrick Naughton");
        Book book2 = new Book("B102", "Effective Java", "Joshua Bloch");
        Book book3 = new Book("B103", "Clean Code", "Robert C. Martin");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create Library Users
        LibraryUser user1 = new LibraryUser("U001", "Alice");
        LibraryUser user2 = new LibraryUser("U002", "Bob");

        // Display books before borrowing
        library.displayBooks();

        // Users Borrow Books
        user1.borrowBook(book1);
        user1.borrowBook(book2);
        user2.borrowBook(book3);
        user2.borrowBook(book1); // This book is already borrowed

        // Display borrowed books
        user1.displayBorrowedBooks();
        user2.displayBorrowedBooks();

        // Display Library books after borrowing
        library.displayBooks();

        // Users Return Books
        user1.returnBook(book1);
        user2.returnBook(book3);

        // Display Library books after returning
        library.displayBooks();
    }
}
