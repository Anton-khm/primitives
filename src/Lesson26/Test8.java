package Lesson26;

public class Test8 {
}

class X{
    static String s="";
    {s += "A";}
    static
    {s+="B";}  // выполняется первым
    {s+="C";}
}
class Z{
    public static void main(String[] args) {
        System.out.println(X.s); // 1. выводится В
        System.out.println(X.s); // 2. выводится В
        new X();                // к В добавилось АС
        new X();                // к ВАС добавилось АС
        System.out.println(X.s);   // 3. выводится ВАСАС
    }
}