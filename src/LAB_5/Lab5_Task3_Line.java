package LAB_5;

//public class Lab5_Task3_Line {
//}
class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint,Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public  double calculateLength(){
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));

    }
    public void display(){
//        System.out.println();
        System.out.println(" line start at:");
        startPoint.display();
        System.out.println("line ends at:");
        endPoint.display();
        System.out.println("Total lenth of line is:" + calculateLength());
    }
}
