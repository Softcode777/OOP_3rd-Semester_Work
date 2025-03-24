package LAB_5;

//public class Lab5_Task3_Point {
//}

 class Point {
    private double x;
    private double y;
    Point() {

        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void display(){
        System.out.println("Points" +":"+("X-cord:" + x + ","+ "y-cord:"+y));
    }
}
