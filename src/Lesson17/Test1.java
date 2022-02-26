package Lesson17;
class Car{}

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder (sb3);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("z"));
        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5,8);   // восьмой элемент не включается в substring
        System.out.println(s2);

        System.out.println(sb2.subSequence(5,8));

  /*      sb2.append(22);         // добавляет что-то новое в конец стринга
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append("Hello");
        System.out.println(sb2);
        sb2.append(new Car());
        System.out.println(sb2);   */

        System.out.println(sb2.insert(4, 55));  // вставили '55' в стринг начиная с 4-го индекса

        StringBuilder sb10 = new StringBuilder("Hello world");
        sb10.delete(3, 6);           // удаляем 3,4,5 символы (6 не включен)
        System.out.println(sb10);

        sb10.deleteCharAt(6);    // удаляет один символ
        System.out.println(sb10);

        sb10.reverse();          // переворачивает стринг
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 5, "Pete");   // заменяет символы с 0 по 5 на нужное слово
        System.out.println(sb12);

        System.out.println(sb12.capacity());

    }
}
