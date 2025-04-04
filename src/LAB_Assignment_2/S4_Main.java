package LAB_Assignment_2;
import java.util.Scanner;
public class S4_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // For Book instance
        System.out.println("Enter details for a Book:");
        S4_Book book = new S4_Book();
        System.out.print("Title: ");
        book.setTitle(scanner.nextLine());
        System.out.print("Price: ");
        book.setPrice(scanner.nextDouble());
        System.out.print("Page Count: ");
        book.setPageCount(scanner.nextInt());
        scanner.nextLine();
        // For Tape instance
        System.out.println("\nEnter details for a Tape:");
        S4_Tape tape = new S4_Tape();
        System.out.print("Title: ");
        tape.setTitle(scanner.nextLine());
        System.out.print("Price: ");
        tape.setPrice(scanner.nextDouble());
        System.out.print("Playing Time (in minutes): ");
        tape.setPlayingTime(scanner.nextInt());
        // Display details
        System.out.println("\nDetails of the Book:");
        book.display();
        System.out.println("\nDetails of the Tape:");
        tape.display();
        System.out.println("ROLL NO: SP24-BCS-085\nNAME: Ikram Niazi\n ");
    }
}
