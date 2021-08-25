package Lesson8;

public class Test1 {

    static double Met1(double a1, double b1, double c1){
        return a1 * b1* c1;
    }

    static void Met2(int a2, int b2){
        System.out.println("Целое частное " + a2/b2 + "; Остаток " + a2%b2);
    }
}

class Test2{
    public static void main(String[] args){
        System.out.println(Test1.Met1(2,3,4));
        Test1.Met2(5,2);
        System.out.println(Test1.Met1(2.5,2.6,2.7));
        Test1.Met2(100,26);
    }
}
