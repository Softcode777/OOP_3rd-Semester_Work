package LAB_5;

public class Activity1_Composition_Main {
    public static void main(String[] args) {
        Activity1_StudentRecord s = new Activity1_StudentRecord();
        s.setDegree("MBA");
        Activity1_EmployeeRecord e = new Activity1_EmployeeRecord();
        e.setEmp_id(1);
        e.setSalary(25000);
        Activity1_Manager m1 = new Activity1_Manager("finance Manager" ,5000,e,s);
        m1.display();
    }
}
