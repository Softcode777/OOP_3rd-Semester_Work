package LAB_Assignment_2;

//Scenario 01: Time Management System

public class S1_Main {
    public static void main(String[] args) {
        S1_Time time1 = new S1_Time();
        time1.displayTime();

        S1_Time time2 = new S1_Time(12, 30, 45);
        time2.displayTime();

        S1_Time time3 = new S1_Time(25, 65, 70);
        time3.displayTime();

        System.out.println("ROLL NO: SP24-BCS-085\nNAME: Ikram Niazi\n ");
    }
}