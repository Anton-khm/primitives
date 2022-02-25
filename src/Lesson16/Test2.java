package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");

  /*    String s10 = s1.substring(3); // новому стрингу присвоили часть оригинального стринга
        System.out.println(s10);
        System.out.println(s1);

        String s11=s1.substring(3,7);  // в новый стринг войдут 3,4,5,6 символы (7 не войдет)
        System.out.println(s11);

        String s12 = s1.trim();  // убирает пробелы по краям стринга
        System.out.println(s12);

        String s13 = s1.substring(3,11); // новому стрингу присвоили часть оригинального стринга
        System.out.println(s13);
*/
        String s14 = s1.replace("e", "a");  // заменили символы
        System.out.println(s14);

        String s15 = s1.replace("pri", "kar");
        System.out.println(s15);

        String s2 = "poka";
        String s3 = s2.replace("k", "k");
        System.out.println(s2 == s3);

        String s5 = "privet,";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
    }
}
