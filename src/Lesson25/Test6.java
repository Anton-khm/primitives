package Lesson25;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;          // narrowing without casting
        System.out.println(7);
//        final int i1 = 3;
//        short s2 = i1;          // int - constanta, casting не нужен
        int i1 =3;
        short s2 = (short) i1;  // casting. Пусть i1 воспринимается как short.
        byte b2 = 127;     // int cast-ится в byte
        short s1 = 1000;   // int cast-ится в short
        char c1 = 100;      // int cast-ится в char

        int i10 = 100000;
        short s10 = (short) i10;
        System.out.println(s10);  // при выводе происходит потеря части информации, потому что значение не вмещается в short
        char c10 = (char) -8;    // значение int закастили в char
        System.out.println(c10); // при выводе происходит потеря части информации, потому что значение с минусом
        // не входит в диапазон char
        int i12 = (int)3.14;
        System.out.println(i12); // при выводе дробная часть обрубилась

//        int i = 2147483647;
//        System.out.println(i+1); // к макс возможному значению инта прибавили один, получили значение с минусом.

        int i =5;
        long l = 10;
        System.out.println(i+l); // сначала i будет конвертировано в long, и  к long прибавится long

     //   i=i*l;  так писать нельзя
        i=(int)(i*l); // casting должен относиться ко всему произведению (i*l) а не только к i
        i*=l;  // при умножении i конвертируется в long, затем это произведение кастится в int и назначается переменной i;
        System.out.println(i+1);

        float f= 3.14f;
        int i2 = 10;
        System.out.println(f+i2);  // i2 конвертируется во float, т.е. 10.00

        byte b3 = 3;
        short s = 4;
        char c = 5;
        System.out.println(b3 +s +c); //перед сложением все типы сконвертируются в int
        System.out.println(b3++); //Исключение: b не будет конвертироваться в int

        byte b4 = 10;
        float f2= 7;
        double d2 = 2.0;
        System.out.println(b4+f2-d2); // cразу b4 сконвертится в int, затем сконвертится во float, результат b4 + f2
        // сконвертится из float в double, и результат всего выражения будет double

        double d10 = 3.14;
        float f10 = 6.28f;
        float f11= 0*1.5f;
        float f12 = 0*(float)1.5; // если писать без f то надо кастить;
    }
}

