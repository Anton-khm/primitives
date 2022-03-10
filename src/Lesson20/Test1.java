package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList<>();          // list2 ссылается на один array list
        ArrayList<String> list5 = new ArrayList<>(list2);      // list5 ссылается на другой array list
        System.out.println(list2 == list5);               // false

        list2.add("poka");
        List<StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("ok"));
    }
}

class Car {
}

class Student {
}
