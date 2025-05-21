package LAB_8;

public class Act1_HourlyEmployee extends  Act1_Employee {
        private double wage; // wage per hour
        private double hours; // hours worked for week
        // five-argument constructor
        public Act1_HourlyEmployee( String first, String last, String ssn,double
                hourlyWage, double hoursWorked )
        {
            super( first, last, ssn );
            wage = hourlyWage;
            hours = hoursWorked;
        }
        @Override
        public double earnings()
        {
            if (hours <= 40 ) // no overtime
                return wage * hours ;
            else
                return 40 * wage + (hours - 40 ) * wage * 1.5;
        } }
