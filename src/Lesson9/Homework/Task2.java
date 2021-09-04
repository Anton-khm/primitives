package Lesson9.Homework;

/*class Task2 {
    int a =1;
    static int a = 2;  // ошибка компиляции. Нельзя использовать переменные с одинаковыми идентификаторами
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Task2 t =new Task2();
        t.abc(3);
    }
}*/

class Test2 {
    int a = 1;
    static int b =2;
    static void abc(final int a){
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

class Test3 {
    int a = 1;
    static int b =2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);   // берется из параметра  (a=4)
        System.out.println(this.a);   // обращение к переменной объекта ( a=1)
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}