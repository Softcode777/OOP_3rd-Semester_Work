package LAB_1;

class Car {
    String brand;
    String model;
    String color;
    int year;
    String fuelType;
    int maxSpeed;
    int currentSpeed;
    boolean engineStatus;


    public void Cardetails(String brand,String model , String color,
    int year, String fuelType, int maxSpeed, int currentSpeed,boolean engineStatus) {


//        engineStatus = false;
    }


    // Displaying LAB_1.Car Details
    public void displaycarinfo(){
        System.out.println("LAB_1.Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
       System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Current Speed: " + currentSpeed + " km/h");
        System.out.println("Engine Status: " + (engineStatus ? "ON" : "OFF"));
    }

    public void carengine() {
        if (engineStatus)
            System.out.println("Engine is ON");
        else {
            System.out.println("Engine is OFF");
        }



    }


}
public class Task3 {
    public static void main(String[] args) {
        // Creating an object of LAB_1.Car
        Car myCar = new Car();

        // Assigning values to the attributes
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.color = "Black";
        myCar.year = 2022;
        myCar.fuelType = "Petrol";
        myCar.maxSpeed = 200;
        myCar.currentSpeed = 0;
        myCar.engineStatus= true; // LAB_1.Car is initially off

        myCar.displaycarinfo();
        myCar.carengine();

    }
}


