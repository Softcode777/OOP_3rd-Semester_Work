package LAB_Assignment_2;

public class S3_PizzaOrder {
    private S3_Pizza[] pizzas;

    // Constructor
    public S3_PizzaOrder() {
        pizzas = new S3_Pizza[3]; // Up to three pizzas
    }

    // Add a pizza to the order
    public void setPizza(int index, S3_Pizza pizza) {
        if (index >= 0 && index < pizzas.length) {
            pizzas[index] = pizza;
        }
    }

    // Calculate total cost of the order
    public double calcTotalCost() {
        double totalCost = 0;
        for (S3_Pizza pizza : pizzas) {
            if (pizza != null) {
                totalCost += pizza.calcCost();
            }
        }
        return totalCost;
    }
}