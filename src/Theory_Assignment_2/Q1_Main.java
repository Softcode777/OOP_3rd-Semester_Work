package Theory_Assignment_2;
//Scenario 1: Course Registration System
//A university wants to develop a Course Registration System where students can register for courses.
//The system should have the following:
//           A Student class with attributes studentId, name, and a list of registered courses.
//           A Course class with attributes courseId, courseName, and creditHours.
//           A Registration class that associates students with courses (use Aggregation).
//Problem Statement:
//           Draw a class diagram representing the system.
//           Implement the Student, Course, and Registration classes in Java.
//           Demonstrate object creation and interaction in a main method.

public class Q1_Main {
        public static void main(String[] args) {
            // Create Students
            Q1_Student student1 = new Q1_Student(1, "Alice");
            Q1_Student student2 = new Q1_Student(2, "Bob");

            // Create Courses
            Q1_Course course1 = new Q1_Course(101, "Data Structures", 3);
            Q1_Course course2 = new Q1_Course(102, "Operating Systems", 4);

            // Students Registering for Courses
            student1.registerCourse(course1);
            student2.registerCourse(course2);

            // Registration Details
            Q1_Registration reg1 = new Q1_Registration(student1, course1);
            Q1_Registration reg2 = new Q1_Registration(student2, course2);

            System.out.println("\nRegistration Details:");
            reg1.showRegistrationDetails();
            reg2.showRegistrationDetails();
        }
    }

