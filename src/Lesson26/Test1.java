package Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(c1.equals(c2));
        System.out.println(list.contains(c3));
        System.out.println(c3.toString());
    }
}

class Car{
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    // overriding метода equals
    public boolean equals (Object obj) {    // метод принимает параметр obj
        if (obj instanceof Car) {    // проверяет: обджект является машиной? если нет - сразу возвращает false
            Car c2 = (Car) obj;   // кастим объект obj на Car
            return (color.equals(c2.color) && engine.equals(c2.engine));  // сравниваем цвета текущей машины с цветом c2
            // и мотор текущей машины с мотором с2;
        } else {
            return false;
        }
    }
    public String toString(){
        return "Machina cveta " + color + " i s motorom " + engine;
    }
}
