package Theory_Assignment_2;

public class Q1_Registration {
    private Q1_Student student;
    private Q1_Course course;

    public Q1_Registration(Q1_Student student, Q1_Course course) {
        this.student = student;
        this.course = course;
    }

    public void showRegistrationDetails() {
        System.out.println("Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
        System.out.println("Registered Course: " + course.getCourseName() + " (Credits: " + course.getCreditHours() + ")");
    }
}