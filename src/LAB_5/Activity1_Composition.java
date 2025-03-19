package LAB_5;
//public class Activity1_Composition {
//}

class StudentRecord {
private String degree;
public StudentRecord() {

}

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

}

class EmployeeRecord {
    private int emp_id;
    private double salary;

    public void EmployeeRecord() {

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager {
    private String title;
    private double dues;
    private EmployeeRecord emp;
    private StudentRecord stu;


    public Manager (String t, double d , EmployeeRecord e , StudentRecord s) {
        title = t;
        dues = d;
        emp = e ;
        stu = s;

        System.out.println("hello");
    }
}
