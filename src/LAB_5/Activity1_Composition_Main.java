package LAB_5;

public class Activity1_Composition_Main {
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord();
        s.setDegree("MBA");
        EmployeeRecord e = new EmployeeRecord();
        e.setEmp_id(1);
        e.setSalary(25000);
        Manager m1 = new Manager("finance Manager" ,5000,e,s);
        m1.display();
    }
}
