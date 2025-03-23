package LAB_5;

//public class Lab5_Task2_Book {
//}

class Book {
     private Person author;
    private String bookName;
    private String  publisher;

    public Book(Person author, String bookName, String publisher) {
        this.author = author;
        this.bookName = bookName;
        this.publisher = publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void display() {
        System.out.println("Book: " + bookName + "\npublisher: " + publisher);
        author.display();

    }
//    public void authorDetails() {
//        System.out.println("Person");
//    }
}
