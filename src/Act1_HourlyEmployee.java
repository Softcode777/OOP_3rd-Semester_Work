import LAB_8.Act1_Employee;

public class Act1_HourlyEmployee extends Act1_Employee {

    private double wage; // wage per hour
    private double hours; // hours worked for week

    public Act1_HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings()
    {
        if (hours <= 40 )
            return wage * hours ;
        else
            return 40 * wage + (hours - 40 ) * wage * 1.5;
    }
}
