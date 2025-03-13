package ASSIGNMENT_1;
public class Assignment_1_Student_Main {
    public static void main(String[] args) {
        Student student = new Student("Ali",20);

        student.name = "JOHN";
        student.setAge(22);

        student.display();
    }
}
