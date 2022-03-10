package Lesson20;

import Lesson10.A;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");                  // метод добавления
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        for(int i=0; i<list.size(); i++){      // метод размера
            System.out.println(list.get(i));    // метод получения элемента по индексу
        }

        list.set(1, "!!!");
        for (String s:list){                    // метод заменяет значение по указанному индексу
            System.out.println(s + " ");
        }

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");

        list.addAll(1, list2);                // метод добавляет элементы в другой Arraylist
        for(String s:list){
            System.out.print(s + " ");
        }
    }
}
