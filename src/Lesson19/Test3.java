package Lesson19;

public class Test3 {
    static void abc(int a){
        System.out.println("Hello");
    }
    static void abc(int... a){
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        abc(5);
    }
}
