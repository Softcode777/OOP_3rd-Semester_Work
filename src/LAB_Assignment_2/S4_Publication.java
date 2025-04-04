package LAB_Assignment_2;

public class S4_Publication {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}