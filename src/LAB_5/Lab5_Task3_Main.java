package LAB_5;

public class Lab5_Task3_Main {
    public static void main(String[] args) {

        Point point1 = new Point(6,8);
        Point point2 = new Point(10,12);
        Point point3 = new Point(20,5);
        Point point4 = new Point(30,10);
        Line L1 = new Line(point1,point2);
        System.out.println("Line 1 details are");
        L1.display();
        Line L2 = new Line(point3,point4);
        System.out.println("Line 2 Details are");
        L2.display();



    }
}
