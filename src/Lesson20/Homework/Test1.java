package Lesson20.Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public ArrayList<String> abc(String... s) {
        ArrayList<String> aL = new ArrayList<>();

        for (String s1 : s) {
            if (!aL.contains(s1)) {         // содержит ли объект aL такой массив s1 ? если не содержит, то добавляем в лист
                aL.add(s1);
            }
        }
        Collections.sort(aL);         // сортируем лист
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        Test1 is = new Test1();
        is.abc("privet", "ok", "poka", "privet", "kak dela?", "ok", "hello");
    }
}
