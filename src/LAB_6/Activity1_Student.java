package LAB_6;

public class Activity1_Student extends Activity1_Person {
    private String rollNo;
    private String marks;


    public Activity1_Student() {
        super();
        rollNo = "sp14bcs039";
        marks = "345" ;
    }
    public Activity1_Student(String a , String b , String c , String d , String e)
    {
        super(a,b,c) ;
        rollNo = d ;
        marks = e;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;

//        public void display()
        {
            super.display();
            System.out.println("Roll # : " + rollNo + "\nMarks : " + marks);
        }
    }
}
