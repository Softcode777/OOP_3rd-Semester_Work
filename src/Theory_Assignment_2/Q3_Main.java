package Theory_Assignment_2;
// EmployeeManagementSystem
public class Q3_Main {
    public static void main(String[] args) {
        // Create an Address Object
        Q3_Address address1 = new Q3_Address("Main_5", "Sahiwal", "57000");

        // Create an Employee Object with the Address
        Q3_Employee employee1 = new Q3_Employee(07, "Ikram", address1);

        // Display Employee Details
        System.out.println("Employee Details:");
        employee1.displayInfo();

        System.out.println("Author: " + "Ikram Niazi " + "Roll no: 085");
    }
}