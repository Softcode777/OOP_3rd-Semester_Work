package LAB_7;

public class Activity_1_B extends Activity_1_A {
    int k;

    public Activity_1_B(int a, int b, int k) {
        super(a, b);
        this.k = k;
    }

    @Override
    void show() {
        System.out.println("k:" + k);
//        super.show();
    }

}

