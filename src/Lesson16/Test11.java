package Lesson16;

public class Test11 {
    public static void main(String[] args) {
   /*     String s1 = "privet";
        System.out.println(s1.isBlank());   // проверяет, состоит ли стринг из пробелов, точек, и т.д.

        String s2 = "              ";
        System.out.println(s2.isBlank());  */

        String s3 = " ";
        System.out.println(s3.isEmpty()); // проверяет, пустой ли стринг

        String s4 = "   privet      ";
        System.out.println(s4.strip());  // удаляет пробелы

        String s5 = "    privet     ";
        System.out.println(s5.stripLeading());  // удаляет пробелы вначале

        String s6 = "    privet     ";
        System.out.println(s5.stripTrailing());  // удаляет пробелы вконце

        String s7 ="poka";
        String s8 = s7.strip();       // ссылается на тот же объект
        System.out.println(s7 == s8);  // true

    }
}
