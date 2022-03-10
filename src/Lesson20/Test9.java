package Lesson20;

import java.util.ArrayList;
import java.util.*;


public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("one");
        aL1.add("two");
        aL1.add("three");
        aL1.add("four");
        aL1.add("five");
//        System.out.println("aL1 = " + aL1);

//        ArrayList <String> aL2 = new ArrayList<>();
//        aL2.add("one");
//        aL2.add("three");
//        aL2.add("four");
//        aL2.add("ten");

        //    aL1.removeAll(aL2);                      // удаляются те которые есть и в первом и во втором листе элементы. Вывод: [two, five]
        //    aL1.retainAll(aL2);                       // выводятся только те которые есть и в первом и во втором листе
        //   System.out.println("aL1 = " + aL1);

//        boolean result = aL1.containsAll(aL2);  // содержит ли лист1 все элементы листа2 ??
//        System.out.println("result = " + result);

//        List <String> sublist = aL1.subList(1,4);    // в новый лист включается все с первого по 3ий элемент включая другого листа
//        System.out.println("sublist = " + sublist);
//        sublist.add("ten");
//        System.out.println("aL1 = " + aL1);
//        System.out.println("sublist = " + sublist);
//        aL1.add("million");
//        System.out.println("aL1 = " + aL1);
//        System.out.println("sublist = " + sublist);   // будет эксепшн потому что нельзя выводить лист который косвенно был изменен до этого
//        Object [] array = aL1.toArray();   // все элементы ("one", "two" и т.д.) будут содержаться в массиве array
//
//        String [] array2 = aL1.toArray(new String[5]);
//        for (String s: array2){
//            System.out.println(s);
//        }
        List<String> list = List.of("odin", "dva", "tri");  // создание листа без использования метода add. Нельзя модифицировать в дальнейшем
        System.out.println("list = " + list);
        List<String> list2 = List.copyOf(aL1);  // создание листа с помощью копирования другого листа. Нельзя модифицировать в дальнейшем
        System.out.println("list2 = " + list2);
    }
}
