package Lesson16;

public class Test10 {
    public static void main(String[] args) {
        String x = "Privet";
        String y = "Privet".trim();   // x и y ссылаются на одинаковый объект, потому что tream ничего не поменял
        System.out.println(x == y);     // true


        /*
        String x = "Privet";
        String y = " Privet".trim();   // tream уберет пробел, и будет создан новый объект
        System.out.println(x==y);    // false

         */
    }
}
