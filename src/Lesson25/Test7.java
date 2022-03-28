package Lesson25;

public class Test7 {
    int a, b=3, c, d=b+5;
    int a2, b2=3, c2, d2=a2+5;
    //int a3, b3=3, c3=10-d3, d3=7;  // d3 еще не приняло значение, поэтому c3 не будет считаться

    public static void main(String[] args) {
        Test7 t = new Test7();
        System.out.println(t.d2);
    }
}
