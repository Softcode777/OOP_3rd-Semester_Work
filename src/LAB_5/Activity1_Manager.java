package LAB_5;

public class Activity1_Manager {
        private String title;
        private double dues;
        private Activity1_EmployeeRecord emp;
        private Activity1_StudentRecord stu;

        public Activity1_Manager (String t, double d ,Activity1_EmployeeRecord e , Activity1_StudentRecord s) {
            title = t;
            dues = d;
            emp = e ;
            stu = s;
        }
        public void display() {
            System.out.println("Title is: " + title );
            System.out.println("Dues is: " + dues );
            System.out.println("Employee record is as under:");
            System.out.println("EmployeeId is: " + emp.getEmp_id());
            System.out.println("EmployeeId is: " +  emp.getSalary());
            System.out.println("student record is as under: ");
            System.out.println("Degree is : " + stu.getDegree());
        }
    }
