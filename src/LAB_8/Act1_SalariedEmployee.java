package LAB_8;
public class Act1_SalariedEmployee extends Act1_Employee{
    private double weeklySalary;

    public Act1_SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}
