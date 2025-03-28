package Theory_Assignment_2;

public class Q5_HotDogStand {
    private String standId;
    private int hotDogsSold;

    // Constructor
    public Q5_HotDogStand(String standId) {
        this.standId = standId;
        this.hotDogsSold = 0; // Initial count of sold hot dogs
    }

    // Method to Increment Sold Hot Dogs
    public void justSold() {
        hotDogsSold++;
    }

    // Getter Method to Retrieve the Number of Sold Hot Dogs
    public int getHotDogsSold() {
        return hotDogsSold;
    }

    public String getStandId() {
        return standId;
    }
}