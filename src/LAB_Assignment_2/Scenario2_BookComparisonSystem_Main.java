package LAB_Assignment_2;

public class Scenario2_BookComparisonSystem_Main {
        public static void main(String[] args) {
            Book book1 = new Book();
            Book book2 = new Book("Jhon",new String[]{"chapter 1","chapter 2","chapter 3"});
            book1.setAuthor("J.R");
            book1.setChapterName(new String[]{"chapter 1","chapter 2"});
            System.out.println("Book 1 details");
            book1.displayBookInfo();
            System.out.println("\nBook 2 details");
            book2.displayBookInfo();
            System.out.println("\nCompare the book author");
            if(book1.compareBook(book2)){
                System.out.println("Both books have the same author");
            }else{
                System.out.println("Both books have different author");
            }
            Book bookmoreChapter = book1.compareChapterName(book2);
            System.out.println("\nBook with more chapter");
            bookmoreChapter.displayBookInfo();

        }
    }
