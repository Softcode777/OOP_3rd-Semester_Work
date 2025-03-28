package Theory_Assignment_2;
import java.util.ArrayList;
import java.util.List;

public class Q1_Student {
        private int studentId;
        private String name;
        private List<Q1_Course> registeredCourses;

        public Q1_Student(int studentId, String name) {
            this.studentId = studentId;
            this.name = name;
            this.registeredCourses = new ArrayList<>();
        }

        public int getStudentId() {
            return studentId;
        }

        public String getName() {
            return name;
        }

        public List<Q1_Course> getRegisteredCourses() {
            return registeredCourses;
        }

        public void registerCourse(Q1_Course course) {
            registeredCourses.add(course);
            System.out.println(name + " has registered for: " + course.getCourseName());
        }
    }




