package LAB_2;
class Distance {
    double feet;
    double inch;
    Distance() {
        feet = 0.0 ;
        inch = 0.0 ;
    }
   Distance (double ft,double inch) {
        feet = ft;
        inch = inch;
   }
   void displayDistance( double feet, double inch) {
       System.out.println("The Room size in feet is" + feet );
       System.out.println("The Room size in inches is" + inch );
   }
}

//public class Lab2_Task3_Distance {
//}
