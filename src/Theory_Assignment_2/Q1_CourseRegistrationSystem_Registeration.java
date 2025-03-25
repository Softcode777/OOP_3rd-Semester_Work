package Theory_Assignment_2;

//public class Q1_CourseRegistrationSystem_Registeration

class Registration {  // Fixed class name
    private Student student;
    private Course course;

    // Constructor
    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Register the student for the course
    public void register() {
        student.registerCourse(course);
        System.out.println(student.getName() + " has successfully registered for " + course.getCourseName());
    }
}

