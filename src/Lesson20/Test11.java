package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mikhail");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova Marya");
        map.put(780, "Petrov Petr");
        map.put(779, "Roberto Carlos");   // если key повторяется, то он перезаписывается
        map.remove(779);            // remove по ключу
        System.out.println("map = " + map);
    }
}
