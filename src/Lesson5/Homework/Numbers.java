package Lesson5.Homework;

public class Numbers {

    void sumOfNumbers(){
        System.out.println(0);
    }

    void sumOfNumbers (int a){
        System.out.println(a);
    }

    void sumOfNumbers (int a, int b){
        System.out.println(a + b);
    }

    void sumOfNumbers (int a, int b, int c){
        System.out.println(a+b+c);
    }

    void sumOfNumbers (int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}

class NumbersTest {
    public static void main(String[] args){
        Numbers n1 = new Numbers();
        n1.sumOfNumbers();
        n1.sumOfNumbers(1);
        n1.sumOfNumbers(2,2);
        n1.sumOfNumbers(3,3,3);
        n1.sumOfNumbers(4,4,4,4);
    }
}
