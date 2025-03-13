package LAB_3;
//
//public class Lab3_Task1_Marks {
//}

class Marks{
    private int mark_1,mark_2,mark_3;

    public Marks(){
        mark_1=0;
        mark_2=0;
        mark_3=0;
    }

    public Marks(int m1,int m2, int m3){
       mark_1 = m1;
       mark_2= m2;
       mark_3 = m3;
    }

    public int getMark_1() {
        return mark_1;
    }

    public void setMark_1(int mark_1) {
        this.mark_1 = mark_1;
    }

    public int getMark_2() {
        return mark_2;
    }

    public void setMark_2(int mark_2) {
        this.mark_2 = mark_2;
    }

    public int getMark_3() {
        return mark_3;
    }

    public void setMark_3(int mark_3) {
        this.mark_3 = mark_3;
    }
}
