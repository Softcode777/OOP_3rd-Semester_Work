package LAB_4;

public class Lab4_Task1_Distance_Main {
        public static void main(String[] args) {
            Distance d1 = new Distance(5, 10);
            Distance d2 = new Distance(3, 8);
            Distance d3 = d1.add(d2);
            d3.display(); // Output: 9 feet 6 inches
        }
    }
