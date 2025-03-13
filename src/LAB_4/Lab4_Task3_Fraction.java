package LAB_4;

//public class Lab4_Task3_Fraction {
//}

class Fraction {
    private int numerator;
    private int denominator;

    // No-arg constructor
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    // Parameterized constructor
    public Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }

    // Setters
    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int den) {
        denominator = den;
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Display
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    // Equals method
    public boolean equals(Fraction f) {
        return (this.numerator * f.denominator) == (f.numerator * this.denominator);
    }
}

