package Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for(int i=0; i<list.size(); i++){
            list.get(i).append("!!!");         // изменили Array List с помощью 2х методов
        }
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }
        System.out.println();

        list.remove(2);              // метод -- удалили элемент
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }


    }
}