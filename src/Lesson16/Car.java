package Lesson16;

import Lesson10.p1.p2.p3.C;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 10;

    /*   public static void main(String[] args) {
           a=10;

       }
   }
   class TestCar   {
       final static Car c = new Car("red", "v8");

       public static void main(String[] args) {
           c.color="black";
       }
   }*/
    public Car abc(String cvet) {                 //метод abc с параметром цвет
        Car c10 = new Car(cvet, "V4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        Car c2 = c.abc("black");                //объект с2 принимает аутпут метода abc, но объект "c" никак не изменился
                                                            // у него по прежнему красный цвет
        System.out.println(c.color);
    }
}