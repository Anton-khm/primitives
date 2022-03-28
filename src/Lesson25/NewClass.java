package Lesson25;

public class NewClass {
}

class Car{
    static int a=5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        c=null;
        System.out.println(c.a); // Здесь не проверяется 'c' ссылается на какой то объект или нет;
        // Здесь проверяется к какому классу относится 'c' и выводится на экран статическая переменная относящаяся к классу Car;
    }
}
