package Theory_Assignment_2;

public class Q1_CourseRegistrationSystem_Main {
    public static void main(String[] args) {

        // CREATE COURSE OBJECTS
        Course course1 = new Course("CS270", "DATABASES SYSTEM", 3);
        Course course2 = new Course("HUM122", "INTRO TO PSYCHOLOGY", 2);
        Course course3 = new Course("HUM208", "CIVICS", 2);

        // CREATE STUDENT OBJECTS
        Student std_1 = new Student("sp24-bcs-085", "Ikram");
        Student std_2 = new Student("sp24-bcs-069", "Sarmad");
        Student std_3 = new Student("sp24-bcs-130", "Mazhar");

        // REGISTER STUDENTS FOR COURSES
        Registration reg_1 = new Registration(std_1, course1);  // Registering Ikram for DATABASE SYSTEM
        Registration reg_2 = new Registration(std_2, course2);  // Registering Sarmad for PSYCHOLOGY
        Registration reg_3 = new Registration(std_3, course3);  // Registering Mazhar for CIVICS

        // CALL REGISTER METHOD TO REGISTER COURSES
        reg_1.register();
        reg_2.register();
        reg_3.register();

        // DISPLAY STUDENT COURSES
        std_1.displayCourse();
        std_2.displayCourse();
        std_3.displayCourse();
    }
}

