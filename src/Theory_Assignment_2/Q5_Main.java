package Theory_Assignment_2;
// HotDogStandSalesSystem
public class Q5_Main {
    public static void main(String[] args) { // HotDogStandSalesSystem
        // Create Three Hot Dog Stands
        Q5_HotDogStand stand1 = new Q5_HotDogStand("Stand001");
        Q5_HotDogStand stand2 = new Q5_HotDogStand("Stand002");
        Q5_HotDogStand stand3 = new Q5_HotDogStand("Stand003");

        // Stand1 Sales
        stand1.justSold();

//        Stand2 Sales
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();

//        Stand3 Sales
        stand3.justSold();
        stand3.justSold();

        // Display Total Number of Hot Dogs Sold Per Stand
        System.out.println("Hot Dog Sales Tracking:");
        System.out.println(stand1.getStandId() + " sold " + stand1.getHotDogsSold() + " hot dogs.");
        System.out.println(stand2.getStandId() + " sold " + stand2.getHotDogsSold() + " hot dogs.");
        System.out.println(stand3.getStandId() + " sold " + stand3.getHotDogsSold() + " hot dogs.");
    }
}