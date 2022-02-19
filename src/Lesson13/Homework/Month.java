package Lesson13.Homework;

public class Month {
    }

    class Test1{
       public static void quantity(int n) {

            switch (n) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Kollichestvo dnei: 31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Kollichestvo dnei: 30");
                    break;
                case 2:
                    System.out.println("Kollichestvo dnei: 28");
                    break;
                default:
                    System.out.println("Nepravilnoe koll-vo dnei");
            }
        }

    public static void main(String[] args) {
       quantity(10);
    }
}