package Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Uraaaaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaaa", "Ураа").substring(6,10);
        // после каждого нового метода s3 сслылается на новый объект
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('W')));    // новый объект World
    }
}
