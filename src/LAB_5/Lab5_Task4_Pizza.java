package LAB_5;
//public class Lab5_Task4_Pizza {
//}

 class Pizza {
    private String sizePizza;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

//    Parametrized Constructor
    public Pizza(String sizePizza, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.sizePizza = sizePizza;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }
//Setter and Getter

    public String getSizePizza() {
        return sizePizza;
    }

    public void setSizePizza(String sizePizza) {
        this.sizePizza = sizePizza;
        switch (sizePizza) {
            case "Small":
            case "Medium":
            case "Large":
                break;
            default:
                System.out.println("Invalid size ");
                this.sizePizza = "Medium";
        }
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;

    }

//    Method for calculating cost of pizza

    public double calculateCost() {
        double baseCost=0.0;
        switch (sizePizza) {
            case "Small":
                baseCost = 10;
                break;
            case "Medium":
                baseCost = 12;
                break;
            case "Large":
                baseCost = 14;
                break;
            default:
                System.out.println("Invalid size");
        }
        return baseCost + 2 * (hamToppings + pepperoniToppings+ cheeseToppings);
    }

//    Method  to getdescription of pizza

    public String getDescription(){
        return "pizza size"+" " + sizePizza +"\nhamToppings:" + hamToppings +
                "\nPEEPRONI TOPPINGD" +pepperoniToppings+"\nCheeseToppings"+cheeseToppings;

    }
}
