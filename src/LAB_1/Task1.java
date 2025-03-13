package LAB_1;//
//class LAB_1.UniManagementsystem {
//   public String Rollnmbr;
//   public String Name;
//   public byte Age;
//   public String Gender;
//   public String Department;
//   public String Course;
//   public float Gpa;
//   public String Email;
//   public String Phonenmbr;
//   public String Address;
//
//   public void StdDetails(String StdRollnmbr,String StdName,byte StdAge,
//                          String StdGender,String Stddepartment,String StdCourse,
//                          float StdGpa,String StdEmail,String Stdphonenmbr,String StdAddress){
//
//       Rollnmbr = StdRollnmbr;
//       Name = Name;
//       Age = StdAge;
//       Gender = StdGender;
//       Department = Stddepartment;
//       Course = StdCourse;
//       Gpa = StdGpa;
//       Email = StdEmail;
//       Phonenmbr = Stdphonenmbr;
//       Address = StdAddress;
//   }
//   public void displyStudentInfo() {
//       System.out.println("Student Information");
//       System.out.println("Rollnmbr" + Rollnmbr);
//       System.out.println("Name" + Name);
//       System.out.println("Age" + Age);
//       System.out.println("Gender" + Gender);
//       System.out.println("Department" + Department);
//       System.out.println("courses" + Course);
//       System.out.println("Gpa"+ Gpa);
//       System.out.println("Email" + Email);
//       System.out.println("Phonenumber" + Phonenmbr);
//       System.out.println("Address" + Address );
//   }
//    public void RegisterCourse(String CourseName) {
//        Course.add(CourseName);
//        System.out.println(Name + " has successfully enrolled in the course: " + CourseName);
//    }
//}
//public class LAB_1.Task1{
//    public static void main(String[] args) {
//
//    }
//}

//import java.util.ArrayList;
//
//class LAB_1.UniManagementsystem {
//    // Attributes
//    public String Rollnmbr;
//    public String Name;
//    public int Age;  // Changed from byte to int
//    public String Gender;
//    public String Department;
//    public ArrayList<String> Course = new ArrayList<>();  // Changed to ArrayList
//    public float Gpa;
//    public String Email;
//    public String Phonenmbr;
//    public String Address;
//
//    // Method to set student details
//    public void StdDetails(String StdRollnmbr, String StdName, int StdAge,
//                           String StdGender, String Stddepartment, float StdGpa,
//                           String StdEmail, String Stdphonenmbr, String StdAddress) {
//
//        Rollnmbr = StdRollnmbr;
//        Name = StdName;
//        Age = StdAge;
//        Gender = StdGender;
//        Department = Stddepartment;
//        Gpa = StdGpa;
//        Email = StdEmail;
//        Phonenmbr = Stdphonenmbr;
//        Address = StdAddress;
//    }
//
//    // Method to display student information
//    public void displyStudentInfo() {
//        System.out.println("\nStudent Information:");
//        System.out.println("Roll Number: " + Rollnmbr);
//        System.out.println("Name: " + Name);
//        System.out.println("Age: " + Age);
//        System.out.println("Gender: " + Gender);
//        System.out.println("Department: " + Department);
//        System.out.println("Courses Enrolled: " + Course);
//        System.out.println("GPA: " + Gpa);
//        System.out.println("Email: " + Email);
//        System.out.println("Phone Number: " + Phonenmbr);
//        System.out.println("Address: " + Address);
//    }
//
//    // Method to register for a course
//    public void RegisterCourse(String CourseName) {
//        Course.add(CourseName);  // Now this works because Course is an ArrayList
//        System.out.println(Name + " has successfully enrolled in: " + CourseName);
//    }
//}
//
//public class LAB_1.Task1 {
//    public static void main(String[] args) {
//        // Creating a student object
//        LAB_1.UniManagementsystem student1 = new LAB_1.UniManagementsystem();
//
//        // Setting student details
//        student1.StdDetails("S101", "Ali Khan", 20, "Male", "Computer Science", 3.8f,
//                "ali.khan@university.com", "0300-1234567", "House #123, Sahiwal");
//
//        // Registering courses
//        student1.RegisterCourse("Java Programming");
//        student1.RegisterCourse("Data Structures");
//
//        // Display student information
//        student1.displyStudentInfo();
//    }
//}

class UniManagementsystem {
    // Attributes
    public String Rollnmbr;
    public String Name;
    public int Age;
    public String Gender;
    public String Department;
    public String Course;  // Changed back to String (Only one course)
    public double Gpa;
    public String Email;
    public String Phonenmbr;
    public String Address;
    public boolean feesPaid;

    // Method to set student details
//    public void StdDetails(String StdRollnmbr, String StdName, int StdAge,
//                           String StdGender, String Stddepartment, String StdCourse,
//                           float StdGpa, String StdEmail, String Stdphonenmbr, String StdAddress) {
//
//        Rollnmbr = StdRollnmbr;
//        Name = StdName;
//        Age = StdAge;
//        Gender = StdGender;
//        Department = Stddepartment;
//        Course = StdCourse;
//        Gpa = StdGpa;
//        Email = StdEmail;
//        Phonenmbr = Stdphonenmbr;
//        Address = StdAddress;
//        feesPaid = false;
//    }

    // Method to display student information
    public void displyStudentInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Roll Number: " + Rollnmbr);
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
        System.out.println("Department: " + Department);
        System.out.println("Course Enrolled: " + Course);
        System.out.println("GPA: " + Gpa);
        System.out.println("Email: " + Email);
        System.out.println("Phone Number: " + Phonenmbr);
        System.out.println("Address: " + Address);
    }

    public void registerCourse(String courseName) {
      Course  = courseName;
        System.out.println(Name + " registered for " + courseName);
    }

    public void Payfeess(double amount) {
        feesPaid  = true ;
        System.out.println(Name + " has successfully paid fees " );
    }




}

public class Task1 {
    public static void main(String[] args) {
        UniManagementsystem student1 = new UniManagementsystem();
        student1.Rollnmbr = "Sp24-bcs-085";
        student1.Name = "Ikram Ullah Khan Niazi";
        student1.Age = 21;
        student1.Gender  = "Male";
        student1.Department = "ComputerScience";
        student1.Course = "OOPS";
        student1.Gpa = 3.66;
        student1.Email = "sp24-bcs-085@gmail.com";
        student1.Phonenmbr = "83459839584";
        student1.Address = "90-6/r Sahiwal";


        student1.registerCourse("OOPS");
        student1.Payfeess(133000);


        // Displaying student information
        student1.displyStudentInfo();
    }
}



//import java.util.ArrayList;
//
//class Student {
//    // Data Members
//    private String studentID;
//    private String name;
//    private int age;
//    private String gender;
//    private String email;
//    private String phoneNumber;
//    private String address;
//    private String department;
//    private String program;
//    private int semester;
//    private ArrayList<String> coursesEnrolled;
//    private double CGPA;
//    private boolean feesPaid;
//    private double attendanceRecord;
//    private String libraryCardNumber;
//
//    // Constructor
//    public Student(String studentID, String name, int age, String gender, String email, String phoneNumber,
//                   String address, String department, String program, int semester, String libraryCardNumber) {
//        this.studentID = studentID;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.address = address;
//        this.department = department;
//        this.program = program;
//        this.semester = semester;
//        this.libraryCardNumber = libraryCardNumber;
//        this.coursesEnrolled = new ArrayList<>();
//        this.CGPA = 0.0;
//        this.feesPaid = false;
//        this.attendanceRecord = 0.0;
//    }
//
//    // Methods
//    public void registerCourse(String courseName) {
//        coursesEnrolled.add(courseName);
//        System.out.println(name + " registered for " + courseName);
//    }
//
//    public void dropCourse(String courseName) {
//        if (coursesEnrolled.remove(courseName)) {
//            System.out.println(name + " dropped " + courseName);
//        } else {
//            System.out.println(courseName + " is not found in enrolled courses.");
//        }
//    }
//
//    public void viewCourses() {
//        System.out.println("Courses Enrolled: " + coursesEnrolled);
//    }
//
//    public void calculateCGPA(double newCGPA) {
//        this.CGPA = newCGPA;
//        System.out.println("Updated CGPA: " + CGPA);
//    }
//
//    public void updateProfile(String email, String phoneNumber, String address) {
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.address = address;
//        System.out.println("Profile updated successfully.");
//    }
//
//    public void payFees(double amount) {
//        feesPaid = true;
//        System.out.println("Fees paid successfully.");
//    }
//
//    public void checkFeeStatus() {
//        if (feesPaid) {
//            System.out.println("Fees have been paid.");
//        } else {
//            System.out.println("Fees are pending.");
//        }
//    }
//
//    public void markAttendance(double percentage) {
//        this.attendanceRecord = percentage;
//        System.out.println("Attendance updated to " + attendanceRecord + "%");
//    }
//
//    public void viewAttendance() {
//        System.out.println("Attendance Record: " + attendanceRecord + "%");
//    }
//
//    public void borrowBook(String bookID) {
//        System.out.println("Book " + bookID + " borrowed successfully using Library Card: " + libraryCardNumber);
//    }
//
//    public void returnBook(String bookID) {
//        System.out.println("Book " + bookID + " returned successfully.");
//    }
//}
//
//// Example usage
//public class LAB_1.Task1 {
//    public static void main(String[] args) {
//        Student student = new Student("S12345", "John Doe", 20, "Male", "john@example.com", "1234567890",
//                "123 Street, City", "Computer Science", "BS CS", 4, "LIB123");
//
//        student.registerCourse("Data Structures");
//        student.viewCourses();
//        student.calculateCGPA(3.8);
//        student.updateProfile("john.doe@example.com", "0987654321", "456 Avenue, City");
//        student.payFees(5000);
//        student.checkFeeStatus();
//        student.markAttendance(85.5);
//        student.viewAttendance();
//        student.borrowBook("BK001");
//        student.returnBook("BK001");
//    }
//}
