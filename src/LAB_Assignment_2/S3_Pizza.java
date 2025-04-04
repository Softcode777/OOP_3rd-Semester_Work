package LAB_Assignment_2;
public class S3_Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public S3_Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size.toLowerCase();
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getCheeseToppings() {
        return cheeseToppings;
    }
    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }
    public int getPepperoniToppings() {
        return pepperoniToppings;
    }
    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }
    public int getHamToppings() {
        return hamToppings;
    }
    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }
    // Calculate cost of the pizza
    public double calcCost() {
        int baseCost;
        if (size.equals("small")) baseCost = 10;
        else if (size.equals("medium")) baseCost = 12;
        else baseCost = 14;
        return baseCost + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
    }
    // Get pizza details
    public String getDescription() {
        return "\nSize: " + size +
                "\n Cheese Toppings: " + cheeseToppings +
                "\n Pepperoni Toppings: " + pepperoniToppings +
                "\n Ham Toppings: " + hamToppings +
                "\n Total Cost: $" + calcCost();

    }
}
