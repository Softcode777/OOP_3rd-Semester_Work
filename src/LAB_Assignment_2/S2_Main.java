package LAB_Assignment_2;

public class S2_Main{
    public static void main(String[] args) {
        S2_Book book1 = new S2_Book();
        book1.setAuthor("Author A");
        String[] chapters1 = {"Chapter 1", "Chapter 2", "Chapter 3"};
        book1.setChapterNames(chapters1);


        String[] chapters2 = {"Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5"};
        S2_Book book2 = new S2_Book("Author B", chapters2);


        boolean sameAuthor = book1.compareBooks(book2);
        System.out.println("Are both books by the same author? " + sameAuthor);
        S2_Book moreChaptersBook = book1.compareChapterNames(book2);
        System.out.println("The book with more chapters is by author: " + moreChaptersBook.getAuthor());

        System.out.println("ROLL NO: SP24-BCS-085\nNAME: Ikram Niazi\n ");
    }
}