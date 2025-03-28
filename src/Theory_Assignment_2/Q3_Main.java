package Theory_Assignment_2;
// EmployeeManagementSystem
public class Q3_Main {

    public static void main(String[] args) {
        // Create an Address Object
        S3_Address address1 = new S3_Address("123 Main Street", "Metropolis", "12345");

        // Create an Employee Object with the Address
        S3_Employee employee1 = new S3_Employee(101, "Alice", address1);

        // Display Employee Details
        System.out.println("Employee Details:");
        employee1.displayInfo();
    }
}