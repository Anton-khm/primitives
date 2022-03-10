package Lesson20;

import java.util.ArrayList;

public class Test5 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add(new String("poka"));
            list.add(new String("privet"));
            list.add(new String("ok"));
            list.add(new String("poka"));
            list.add(new String("hello"));
            for (String sb: list) {
                System.out.print(sb + " ");
            }
          //  System.out.println(list.indexOf(new String("poka")));   // метод выводит индекс первого совпадения значения
            System.out.println(list.lastIndexOf(new String("poka")));  // метод выводит индекс последнего совпадения значения
            System.out.println(list.size()); // метод выводит размер объекта
            //list.clear();
            System.out.println(list.isEmpty());  // метод проверяет пустой ли лист
            System.out.println(list.contains("poka"));  // метод смотрит содержит ли объект такой array
            System.out.println(list.toString());  // метод выводит элементы внутри []
        }
    }

