package Lesson21;

public class Test5 {
    void abc(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test5 t =new Test5();
        char c = 'a';
        t.abc(c);               // выводится порядковый номер элемента -- 97
        // System.out.println('b' +10); // выводится порядковый номер элемента -- 108
    }
}
