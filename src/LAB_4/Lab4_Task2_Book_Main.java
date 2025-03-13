package LAB_4;

public class Lab4_Task2_Book_Main {

        public static void main(String[] args) {
            String[] chapters1 = {"Intro", "Basics", "Advanced"};
            String[] chapters2 = {"Start", "Middle", "End", "Bonus"};

            Book book1 = new Book();
            book1.setAuthor("Ali");
            book1.setChapters(chapters1);

            Book book2 = new Book("Ali", chapters2);

            System.out.println("Are authors same? " + book1.compareBooks(book2));

            Book bigger = book1.compareChapterNames(book2);
            System.out.println("Book with more chapters is by: " + bigger.getAuthor());
        }
    }
