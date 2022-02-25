package Lesson16.Homework;

import java.util.Locale;

public class Test1 {

    public void email(String email){

        char c1;

        for(int a = email.indexOf('@'); a<email.indexOf('.');a++){

            c1 = email.charAt(a);

            if (c1 == '@') {
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
       Test1 e1 = new Test1();
       e1.email("ya@yahoo.com; on@mail.ru;");
    }
}



