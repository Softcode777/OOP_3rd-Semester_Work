package LAB_2;
//public class Lab2_Task1_Circle {
//
//}
    class Circle {
        double radius;

        Circle() {
            radius = 1.0;
        }

        Circle(double radius) {
            this.radius = radius;
        }

        double getCircumference() {
            return 2 * Math.PI * radius;
        }

    }

