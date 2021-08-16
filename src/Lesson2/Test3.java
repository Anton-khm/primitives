package Lesson2;

public class Test3 {
    public static void main(String [] args){


         int x = 10;
         int y = 5;


         int i1 = 5;
         int i2 = 11;

         double d1 = 5.5;
         double d2 = 1.3;

         long l=20l;

         double result = 0;

         result = i2/d1 + d2%i1 - l;

         int str;
         int a =5;
         str = a-- - --a + ++a + a++ + a;
         int b=8;
         int stc = ++b - b++ + ++b - --b;

        System.out.println(result);
        System.out.println(str);
        System.out.println(stc);


    }
}
