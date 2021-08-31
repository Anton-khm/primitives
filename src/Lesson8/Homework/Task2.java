package Lesson8.Homework;

public class Task2 {

    public final static double Pi = 3.14;

    public double calculateSquare (double r){
        double squareCircle;
        return squareCircle = Pi * r * r;
    }

    public static double calculateCircle (double r2){
        double c;
        return c = 2 * Pi * r2;
    }

    public void showInfo (double r3){
        System.out.println("Radius :  " + r3);
        System.out.println("Ploschad :  " + calculateSquare(r3));
        System.out.println("Dlina :  " + calculateCircle(r3));
    }
}

class TestTask2{
    public static void main(String[] args){
        Task2 t1 = new Task2();
        t1.calculateSquare(15);
        t1.showInfo(20);
        Task2.calculateCircle(10);
    }
}
