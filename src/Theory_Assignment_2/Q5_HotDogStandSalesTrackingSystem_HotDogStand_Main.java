package Theory_Assignment_2;

public class Q5_HotDogStandSalesTrackingSystem_HotDogStand_Main {
    public static void main(String[] args) {
        // Creating Hot Dog Stand Objects
        HotDogStand stand1 = new HotDogStand(1, 5);
        HotDogStand stand2 = new HotDogStand(2, 8);
        HotDogStand stand3 = new HotDogStand(3, 10);

        // Selling hot dogs
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();

        stand2.justSold();
        stand2.justSold();
        stand2.justSold();

        stand3.justSold();
        stand3.justSold();
        stand3.justSold();

        // **Displaying Sales Data**
        System.out.println("\nSales Summary:");
        stand1.displaySales();
        stand2.displaySales();
        stand3.displaySales();
    }
}
