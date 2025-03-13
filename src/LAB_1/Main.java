package LAB_1;

class CourseResult {
    public String studentname;
    public String coursename;
    public String grade;
    public void display() {
        System.out.println("Student Name is: " + studentname  +  "\ncourse Name is: "  + coursename + "\nGrade is: "  +  grade);
    }
}
public class Main {
    public static void main(String[] args) {
        CourseResult c1 = new CourseResult();
        c1.studentname = "Ali";
        c1.coursename = "oops";
        c1.grade = "A";
        c1.display();
        CourseResult c2 = new CourseResult();
        c2.studentname = "Ikram";
        c2.coursename = "ICT";
        c2.grade = "A+";
        c2.display();
    }
}

