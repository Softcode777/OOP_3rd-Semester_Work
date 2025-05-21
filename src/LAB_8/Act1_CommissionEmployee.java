package LAB_8;

public class Act1_CommissionEmployee extends Act1_Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public Act1_CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }
}

