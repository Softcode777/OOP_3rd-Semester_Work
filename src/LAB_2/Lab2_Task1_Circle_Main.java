package LAB_2;

public class Lab2_Task1_Circle_Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circumference of default circle: " + circle1.getCircumference());

        Circle circle2 = new Circle(5);
        System.out.println("Circumference of circle with radius 5: " + circle2.getCircumference());
    }
}
