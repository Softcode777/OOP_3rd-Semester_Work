package LAB_1;

class Planet
{
    public double radius;
    public String name;
    public static final long g = 10;
    public void display() {
        System.out.println("Radius "+ radius);
        System.out.println("Name " + name);
        System.out.println("Long "+ g);
    }
    public void initialize()
    {
        radius = 10;	//usage
        name = "Dunya";

    }
    public static void main(String [] args)
    {
        Planet p = new Planet(); // creation
        p. initialize();		//usage
        p.display();		//usage

    }
}
