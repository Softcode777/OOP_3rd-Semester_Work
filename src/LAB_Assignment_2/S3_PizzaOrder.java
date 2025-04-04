package LAB_Assignment_2;

class S3_PizzaOrder {
    private S3_Pizza pizza1;
    private S3_Pizza pizza2;
    private S3_Pizza pizza3;
    public S3_PizzaOrder(S3_Pizza pizza1){
        this.pizza1 = pizza1;
    }
    public S3_PizzaOrder(S3_Pizza pizza1,S3_Pizza pizza2){
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }
    public S3_PizzaOrder(S3_Pizza pizza1,S3_Pizza pizza2,S3_Pizza pizza3){
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }
    public double calcTotal() {
        double total = 0.0;
        if (pizza1 != null) total += pizza1.calcCost();
        if (pizza2 != null) total += pizza2.calcCost();
        if (pizza3 != null) total += pizza3.calcCost();
        return total;
    }
}
