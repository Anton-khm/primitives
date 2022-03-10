package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList <String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        System.out.println(list1);
        Collections.sort(list1);     // сортировка листа
        System.out.println(list1);

        ArrayList <String> list2 = list1;
        ArrayList <String> list3 = new ArrayList<>();
        ArrayList <String> list4 = new ArrayList<>();
        list4.add(s3);
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);

        System.out.println(list1.equals(list4));   // 2 ArrayList равны если они содержат одинаковые элементы

        Iterator <String> it = list1.iterator();   // сможем пробежаться по элементам листа
        while (it.hasNext()){                        // есть следующий элемент? да --- идем дальше
        //    System.out.println(it.next());          // с помощью итератора можно удалить элемент, в форич нельзя
            it.next();           // выдача элемента
            it.remove();          // удаление элемента
        }

    }
}
