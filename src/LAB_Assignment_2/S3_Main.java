package LAB_Assignment_2;

public class S3_Main {
    public static void main(String[] args) {
        S3_Pizza pizza1 = new S3_Pizza("Medium",2,3,1);
        System.out.println("Pizza 1 description:"+pizza1.getDescription());
        System.out.println("Pizza 1 cost is:"+pizza1.calcCost());
        System.out.println("--------------------");

        S3_Pizza pizza2 = new S3_Pizza("Large",1,2,3);
        System.out.println("Pizza 2 description "+pizza2.getDescription());
        System.out.println("pizza cost is:"+pizza2.calcCost());
        System.out.println("--------------------");

        S3_Pizza pizza3 = new S3_Pizza("Large",1,2,3);
        System.out.println("Pizza 2 description "+pizza3.getDescription());
        System.out.println("pizza cost is:"+pizza3.calcCost());
        System.out.println("--------------------");

        S3_PizzaOrder Order = new S3_PizzaOrder(pizza1,pizza2);
        double total = Order.calcTotal();
        System.out.println("Total cost of order pizza1 and pizza2 is :"+total);

        System.out.println("ROLL NO: SP24-BCS-085\nNAME: Ikram Niazi\n ");
    }
}