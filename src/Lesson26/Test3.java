package Lesson26;

public class Test3 {
    void abc (int i){
        System.out.println("int");
    }
    void abc(byte i){
        System.out.println("byte");
    }
    void abc(long i){
        System.out.println("long");
    }
    void def(Object o){
        System.out.println("Object");
    }
    void def(String o){
        System.out.println("String");
    }

    void ghi (int a, int b){             // первый приоритет при вызове
        System.out.println("Hello1");
    }
    void ghi (long a, long b){            // второй приоритет при вызове
        System.out.println("Hello2");
    }
    void ghi (Integer a, Integer b){         // третий приоритет при вызове
        System.out.println("Hello3");
    }
    void ghi (int ... a){                     // последний приоритет при вызове
        System.out.println("Hello4");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.ghi(1,2);
    }
}
