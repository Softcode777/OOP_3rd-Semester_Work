package LAB_2;

class Marks {
    int Math, Science, Oops;
    Marks() {
        Math = 100;
        Science = 100;
        Oops = 100;
    }
        Marks( int MTH, int SCN, int OOP){
            Math = MTH;
            Science = SCN;
            Oops = OOP;
        }
        void displayMarks () {
            System.out.println("Marks in Math Subject are: " + " " + Math);
            System.out.println("Marks in Science Subject are: " + " " + Science);
            System.out.println("Marks in OOP Subject are: " + " " + Oops);
        }
       int displaySumofMarks(){
        int sum;
       return sum = (Science + Math +Oops);
        }

    }










//
//public class Lab2_Task4_Marks {
//}
