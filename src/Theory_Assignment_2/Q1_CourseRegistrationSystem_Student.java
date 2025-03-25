package Theory_Assignment_2;
//public class Q1_CourseRegistrationSystem_Student {
//}


import java.util.List;
import java.util.ArrayList;

class Student {
    private String studentId;
    private String name;
    private List<Course> registeredCourses;

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Course> getRegisteredCourses() {
//        return registeredCourses;
//    }
//
//    public void setRegisteredCourses(List<Course> registeredCourses) {
//        this.registeredCourses = registeredCourses;
//    }

    // Method to register a course
    public void registerCourse(Course course) {
        registeredCourses.add(course);
        System.out.println(name + " registered for " + course.getCourseName());
    }

    // Display student details
    public void displayCourse() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
        System.out.println("Registered Courses:");
        for (Course course : registeredCourses) {
            course.display();
        }
    }
}
