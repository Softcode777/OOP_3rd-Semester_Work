package LAB_4;

//public class Lab3_Task1_Distance {
//}

class Distance {
    private int feet;
    private int inches;

    // No-arg constructor
    public Distance() {
        feet = 0;
        inches = 0;
    }

    // Parameterized constructor
    public Distance(int ft, int in) {
        feet = ft;
        inches = in;
    }

    // Setters
    public void setFeet(int ft) {
        feet = ft;
    }

    public void setInches(int in) {
        inches = in;
    }

    // Getters
    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    // Display
    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    // Add method
    public Distance add(Distance d) {
        int totalFeet = this.feet + d.feet;
        int totalInches = this.inches + d.inches;

        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches = totalInches % 12;
        }

        return new Distance(totalFeet, totalInches);
    }
}

