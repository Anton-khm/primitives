package Lesson16;

public class Test1 {

    public static void main(String[] args) {

        String s1 = new String("privetik");

        int a = s1.length();    // длина
        System.out.println(a);

        char c1 = s1.charAt(3);    // возвращает значение по индексу
        System.out.println(c1);

        int i1 = s1.indexOf('t');   // возвращает индекс по значению
        System.out.println(i1);

        int i2 = s1.indexOf("яet");  // возвращает индекс по значению до первого совпадения, если не найдено, то "-1"
        System.out.println(i2);

        int i4 = s1.indexOf("i", 4);
        System.out.println(i4);   // возвращает индекс по значению, начиная поиск с указанного индекса

        boolean b1 = s1.startsWith("pri",0);  // проверяет, начинается ли слово с таких символов
        System.out.println(b1);

        boolean b2 = s1.endsWith("tik"); // проверяет, заканчивается ли слово на таких символах
        System.out.println(b2);


    }

}
