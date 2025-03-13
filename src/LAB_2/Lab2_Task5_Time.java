package LAB_2;

import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    Time() {
    hours = 24;
    minutes = 60;
    seconds = 60;
    }

    Time(int hr, int min, int sec) {
        hours = hr;
        minutes = min;
        seconds = sec;
    }
    public void setHours(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Hours");
        int hours = scanner.nextInt();
        if(hours<=24) {
            System.out.println("Time is valid ");
        } else {
            System.out.println("time is invalid ");
        }
    }  public void setMinutes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minutes");
        int minutes = scanner.nextInt();
        if(hours<=60) {
            System.out.println("minutes is valid ");
        } else {
            System.out.println("minutes is invalid ");
        }
    }  public void setSeconds(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Hours");
        int seconds = scanner.nextInt();
        if(hours<=60) {
            System.out.println(" seconds is valid ");
        } else {
            System.out.println("seconds is invalid ");
        }
    }

    public void displayTime(){
        System.out.println("The time is:" + hours +":"+ minutes+":" + seconds);
    }

}
//public class Lab2_Task5_Time {
//}
