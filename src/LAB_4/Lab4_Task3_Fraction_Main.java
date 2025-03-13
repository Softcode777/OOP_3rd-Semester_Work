package LAB_4;

public class Lab4_Task3_Fraction_Main {
        public static void main(String[] args) {
            Fraction f1 = new Fraction(8, 10);
            Fraction f2 = new Fraction(1, 2);

            f1.display();  // 2/4
            f2.display();  // 1/2

            System.out.println("Are fractions equal? " + f1.equals(f2));  // true
        }
    }

