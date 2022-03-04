package Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char [] array={'p', 'r', 'i', 'v', 'e', 't'};
    //    String s =new String(array);
     //   System.out.println(s);
        StringBuilder sb = new StringBuilder("Hello World");
       // sb.append(array, 2, 3);   // добавили к стрингбилдеру 3 элемента начиная со 2-го индекса по 4-й
        sb.insert(2, array,1,3);  // в стрингбилдер начиная со второго индекса вставим массив с 1-го по 3-й индексы
        System.out.println(sb);
    }
}
