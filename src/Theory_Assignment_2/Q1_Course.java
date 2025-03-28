package Theory_Assignment_2;

public class Q1_Course{
    private int courseId;
    private String courseName;
    private int creditHours;

    public Q1_Course(int courseId, String courseName, int creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getCreditHours() {
        return creditHours;
    }
}