package Lesson11.Homework;

public class Lesson11 {

}

class Car {
    String color;
    double engine;
    int doors;

    Car(String color, double engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {
    void swap1 (Car c, int doors){
        c.doors = doors;  // объекту 'с' меняем колличество дверей на колличество из параметра метода.
    }

    void swap2 (Car c1, Car c2){   // цель метода - поменять цвета объекта
        String color = c1.color;  // вспомогательной третьей переменной присваивается цвет первого объекта
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("green", 3.0, 4);
        Car car2 = new Car("red", 2.5, 4);
        ct.swap1(car1, 3);
        ct.swap2(car1, car2);
        System.out.println(car1.color +" "+ car1.engine + " "+car1.doors);
        System.out.println(car2.color +" "+ car2.engine + " "+car2.doors);
    }
}
