package LAB_5;

public class Lab5_Task4_Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Medium",2,3,1);
        System.out.println("Pizza 1 cost is:"+pizza1.calculateCost());
        System.out.println("Pizza 1 description:"+pizza1.getDescription());
        Pizza pizza2 = new Pizza("Large",1,2,3);
        System.out.println("pizza cost is:"+pizza2.calculateCost());
        System.out.println("Pizza 2 description "+pizza2.getDescription());
        Pizza pizza3 = new Pizza("Large",1,2,3);
        System.out.println("pizza cost is:"+pizza3.calculateCost());
        System.out.println("Pizza 2 description "+pizza3.getDescription());
        PizzaOrder Order = new PizzaOrder(pizza1,pizza2);
        double total = Order.calcTotal();
        System.out.println("cost of order is:"+total);

    }
}

