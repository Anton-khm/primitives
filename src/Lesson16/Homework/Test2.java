package Lesson16.Homework;

public class Test2 {
    public void email(String email) {

        int a = 0;  // @
        int b = 0;   // .
        int c = 0;   // ;

        while (c < email.length()-1) {         // последний индекс будет равен длине - 1

            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1);
            System.out.println(email.substring(a + 1, b));

        }
    }

    public static void main(String[] args) {
        Test2 e1 = new Test2();
        e1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

