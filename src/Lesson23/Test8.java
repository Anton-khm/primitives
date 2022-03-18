package Lesson23;

public class Test8 {
    public static void main(String[] args) {
        A2 c1 = new C();   // можно вызывать только элементы которые есть в parent классе. Тоесть классе А.
        c1.abc(new B2());  // на экран выведется А
    }
}

class A2{
    void abc(A2 a){
        System.out.println("A");
    }
}

class B2 extends A2{
    void abc (B2 b1){
        System.out.println("B");
    }
}

class C extends B2{
    void abc(B2 b2){                // метод abc из класса C перезаписал метод abc из класса b2
        System.out.println("C");
    }
}