package LAB_8;

public abstract class Act1_Employee {
private String firstName;
private String lastName;
private String socialSecurityNumber;

    public Act1_Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString() {
        return String.format("%s %s\nsocial security number: %s", firstName, lastName, socialSecurityNumber);
    }
    public abstract double earnings();
}

