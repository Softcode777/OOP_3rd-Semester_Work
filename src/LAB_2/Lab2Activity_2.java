package LAB_2;

class Rectangle2 {
    public int length, width;
    public Rectangle2() {
        length = 5;
        width = 2;
    }
    public Rectangle2(int l, int w) {
        length = l;
        width = w;
    }
    public int Calculatearea() {
        return (length * width);
    }
}
public class Lab2Activity_2 {

    public static void main(String args[]) {
        Rectangle2 rect = new Rectangle2();
        System.out.println(rect.Calculatearea());
        Rectangle2 rect1 = new Rectangle2(10, 20);
        System.out.println(rect1.Calculatearea());
    }
}

