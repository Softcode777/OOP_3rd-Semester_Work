package Theory_Assignment_2;

//public class Q4_LibraryManagementSystem_Book {
//}
class Book {
    private final String bookId;
    private final String title;
    private final String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // Initially, the book is not borrowed
    }

    // Getters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Methods to borrow and return books
    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    // Display Book Information
    public void displayBook() {
        System.out.println("Book ID: " + bookId + " | Title: " + title + " | Author: " + author +
                " | Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}


