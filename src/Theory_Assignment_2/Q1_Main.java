package Theory_Assignment_2;
//Course Registration System
public class Q1_Main {
        public static void main(String[] args) {
            // Create Students
            Q1_Student student1 = new Q1_Student(1, "Ikram");
            Q1_Student student2 = new Q1_Student(2, "Burhan");

            // Create Courses
            Q1_Course course1 = new Q1_Course(01, "OOP", 3);
            Q1_Course course2 = new Q1_Course(02, "Civics", 2);

            // Students Registering for Courses
            student1.registerCourse(course1);
            student2.registerCourse(course2);

            // Registration Details
            Q1_Registration reg1 = new Q1_Registration(student1, course1);
            Q1_Registration reg2 = new Q1_Registration(student2, course2);

            System.out.println("\nRegistration Details:");
            reg1.showRegistrationDetails();
            reg2.showRegistrationDetails();

            System.out.println("Author" + "Ikram Niazi " + "Roll no: 085");
        }
    }

