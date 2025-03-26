package LAB_6;

public class Activity2_Main {

    public static void main(String []args){
        Activity2_Regular regularObj = new Activity2_Regular("Ahmed","090078601","Islamabad",15000,60000);
        regularObj.Display();
        Activity2_Adhoc adhocObj = new Activity2_Adhoc("Ali","03333333333","Rawalpindi",500,23,1500);
        adhocObj.Display();
    }
}

