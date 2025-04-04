package LAB_Assignment_2;

public class S3_Main {
    public static void main(String[] args) {
        S3_Pizza pizza1 = new S3_Pizza("large", 2, 1, 1);
        S3_Pizza pizza2 = new S3_Pizza("medium", 1, 2, 0);
        S3_Pizza pizza3 = new S3_Pizza("small", 0, 1, 1);

        S3_PizzaOrder order = new S3_PizzaOrder();
        order.setPizza(0, pizza1);
        order.setPizza(1, pizza2);
        order.setPizza(2, pizza3);

        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
        System.out.println("Total Order Cost: $" + order.calcTotalCost());

        System.out.println("ROLL NO: SP24-BCS-085\nNAME: Ikram Niazi\n ");
    }
}