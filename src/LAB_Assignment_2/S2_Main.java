package LAB_Assignment_2;

public class S2_Main {
    public static void main(String[] args) {
        S2_Book book1 = new S2_Book();
        book1.setAuthor("james clear");
        String[] chapters1 = {"Chapter1", "Chapter2"};
        book1.setChapterNames(chapters1);
        String[] chapters2 = {"Chapter1", "Chapter2","Chapter3","Chapter4"};
        S2_Book book2 = new S2_Book("Robert", chapters2);
        //  Display book details
        System.out.println("Book 1 Details:");
        book1.displayBook();

        System.out.println("Book 2 Details:");
        book2.displayBook();

        //  Comparing authors
        if (book1.compareBooks(book2)) {
            System.out.println("Both books are written by the same author.");
        } else {
            System.out.println("Books have different authors.");
        }
        //  Comparing chapter count
        S2_Book largerBook = book1.compareChapterNames(book2);
        System.out.println("The book with more chapters is written by: " + largerBook.getAuthor());

        System.out.println("ROLL NO: SP24-BCS-085\nNAME: Ikram Niazi\n ");
    }
}

