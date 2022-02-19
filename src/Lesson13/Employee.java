package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("chetverg"){              // типа данных в скобках может быть byte, short, int, char, String
                                          // long, double, boolean, не подходят
            /* int denNedeli = 3;

            switch (denNedeli){}
             */
            case "ponedelnik":

            case "vtornik":

            case "sreda":

            case "chetverg":

            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskreseniye":
                System.out.println("Raboty net");
                break;
            default:
                System.out.println("Nety takogo dnya");
        }
    }
}
