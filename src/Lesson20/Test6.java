package Lesson20;

import java.util.ArrayList;
import java.util.*;

public class Test6 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
      /*    ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();  // метод клонирования объекта
        System.out.println(list1.get(0) == list2.get(0));          // true
        list1.get(0).append("!!!");
        System.out.println(list2.get(0));    */
     /*   Object [] array1 = list1.toArray();   // аутпут метода -- массив объекта
        for(Object o : array1){
            System.out.println(o);
        }*/
      /*  StringBuilder [] array2 = list1.toArray(new StringBuilder[10]);
        for(StringBuilder sb:array2){
            System.out.println(sb);
        } */
        StringBuilder [] array = {sb2, sb3, sb3, sb3};
        List <StringBuilder> list8 = Arrays.asList(array);
      //  System.out.println(list8);
       // array[0].append("!!!");                           метод добавляет значение к элементу
        // array[0] = new StringBuilder("!!!!!");         заменяет элемент по индексу
        System.out.println(list8);
    }
}
