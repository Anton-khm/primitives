package Lesson26;

public class Test6 {
    int a = 3;      //сразу а=3;

    Test6() {   // в итоге a=4;
        a = 4;
    }

    {
        a = 5;  // потом a=5;
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);        //вывод: 4
//    }
}

class A{
    static final int b;
    static {b=10;}  // static константу можно определять в static initializer'e
}

class B{
    static int c;
    static final int d;
    static final int e;
    static final int f;
    static {
        c=5;
        d=3;
        e=2;  //константам придаются значения в статическом инициализаторе
        f=0;
    }
}

class C{
    String s = "ok";
    {
        System.out.println(s);       //выводится третьим
    }
    static int i=0;
    static {
        System.out.println(i);      //выводится первым
    }
    {
        i=i+1;
        System.out.println(i);       //выводится четвертым
    }
    C(){
        System.out.println("eto constructor");       //выводится пятым
    }

    public static void main(String[] args) {
        System.out.println("Privet vsem");    //выводится вторым
        C c = new C();
    }
}

class D{
    static {abc(2);}       // выполняется первым: вывод 2
    static void abc(int a){
        System.out.println(a+" ");
    }
    D(){abc(5);}        // выполняется шестым: вывод 5
    static {abc(4);}        // выполняется вторым: вывод 4
    {abc(6);}               // выполняется четвертым: вывод 6
    static {new D();}           //  выполняется третьим; происходит создание объекта D. Перед вызовом конструктора выполняются все
                                // нон-статик инициализаторы.
    {abc(8);}           // выполняется пятым: вывод 8

    public static void main(String[] args) {

    }
}