package Lesson19;

public class Test2 {
  /*  static void summa(int a, int b) {
        System.out.println(a + b);
    }

    static void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void summa(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
*/
  static void summa(String s, int ... a) {    // метод summa можно вызвать с любым колличеством параметров
      int summa = 0;
      for(int i=0; i<a.length; i++){
          summa+=a[i];
      }
      System.out.println(summa);
  }

    public static void main(String[] args) {
        summa("ok", 6,3,10);
        // summa(new int[]{1,2,3});  выведется сумма 1+2+3=6
        // summa(null);  exception
        // public static void main(String ... args)      массив типа стринг заменяем на varargs типа стринг
    }
}
