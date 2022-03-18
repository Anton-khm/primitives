package Lesson23;

public class A10 {
    String s1 = "privet";
    static double dl=3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}

class B10 extends A10{
    String s2 = super.s1 + ", drug!";    // обращение к parent классу
    boolean s1 = true;

    @Override
    int summa(int... i) {
        int result =  super.summa(i);     // обращение к parent классу
        System.out.println("Summma: " +result);
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s2);
    }
}
