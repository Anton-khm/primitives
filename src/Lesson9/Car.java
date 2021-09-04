package Lesson9;

public class Car {
    public static int a = 10;
    String color;
    String engine;
    public static int count;

    public Car(String color, String engine){
        count++;
        this.engine = engine;
        this.color = color;
    }

    public void ShowColor(){
        System.out.println("Цвет машины: " + color);
    }

    public void ChangeColor(String color3){
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }
}
