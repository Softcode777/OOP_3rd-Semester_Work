import LAB_8.Act1_BasePlusCommissionEmployee;
import LAB_8.Act1_CommissionEmployee;
import LAB_8.Act1_Employee;
import LAB_8.Act1_SalariedEmployee;

public class Act1_PayrollSystemTest {
    public static void main( String[] args ) {
            Act1_SalariedEmployee salariedEmployee = new Act1_SalariedEmployee ("John",
                    "Smith", "111-11-1111", 800.00 );
            Act1_HourlyEmployee hourlyEmployee= new Act1_HourlyEmployee( "Karen", "Price",
                    "222-22-2222", 16.75, 40 );
            Act1_CommissionEmployee commissionEmployee = new Act1_CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06 );
            Act1_BasePlusCommissionEmployee basePlusCommissionEmployee = new Act1_BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000);
            Act1_Employee[] employees = new Act1_Employee[ 4 ];
            employees[ 0 ] = salariedEmployee;
            employees[ 1 ] = hourlyEmployee;
            employees[ 2 ] = commissionEmployee;
            employees[ 3 ] = basePlusCommissionEmployee;
            for (int i=0; i<4 ;i++)
            {
                System.out.println(employees[i].earnings()); //polymorphic call
            } }
}


