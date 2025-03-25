package Theory_Assignment_2;

//public class Q1_CourseRegistrationSystem_Course {
//}
class Course {
    private String courseId;
    private String courseName;
    private int creditCourse;  // Consider renaming to creditHours for clarity

    // Constructor
    public Course(String courseId, String courseName, int creditCourse) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditCourse = creditCourse;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditCourse() {
        return creditCourse;
    }

    public void setCreditCourse(int creditCourse) {
        this.creditCourse = creditCourse;
    }

    // Display method to print course details
    public void display() {
        System.out.println("Course ID: " + courseId + ", Course Name: " + courseName + ", Credit Hours: " + creditCourse);
    }
}
