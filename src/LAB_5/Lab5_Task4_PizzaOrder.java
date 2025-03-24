package LAB_5;
class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    public PizzaOrder(Pizza pizza1){
        this.pizza1 = pizza1;
    }
    public PizzaOrder(Pizza pizza1,Pizza pizza2){
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }
    public PizzaOrder(Pizza pizza1,Pizza pizza2,Pizza pizza3){
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

//    Method to calculate total
    public double calcTotal() {
        double total = 0.0;
        if (pizza1 != null) total += pizza1.calculateCost();
        if (pizza2 != null) total += pizza2.calculateCost();
        if (pizza3 != null) total += pizza3.calculateCost();
        return total;
    }
}