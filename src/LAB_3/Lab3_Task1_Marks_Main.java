package LAB_3;

public class Lab3_Task1_Marks_Main {
    public static void main(String[] args) {
//        Marks m0= new Marks();
//        System.out.println(" ");

        Marks m1= new Marks();
        m1.setMark_1(50);
        m1.setMark_2(89);
        m1.setMark_3(70);

        System.out.println("marks 1" + m1.getMark_1());
        System.out.println("marks 2" + m1.getMark_2());
        System.out.println("marks 3" + m1.getMark_3());

    }
}