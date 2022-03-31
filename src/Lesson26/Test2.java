package Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);  // автобоксинг -- примитивный тип инт был конвертирован в референс тип интеджер
        int a = list.get(0); // unboxing -- из типа обджект в тип инт
        System.out.println(a);
//        Integer b = new Integer(10);
//        int c = b;
//        switch (b){ }
        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        double d = Double.parseDouble(s3);
        System.out.println(d);

        Integer i3 = Integer.valueOf(10);  // создается объект  Int, i3 ссылается на него со значением 10
        Double d2 = Double.valueOf(s3);  // создается объект типа double, d2 ссылается на него со значением s3
        System.out.println(i3);
    }
}
