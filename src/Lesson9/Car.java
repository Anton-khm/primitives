package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color, String engine){
        count++;
        this.engine = engine;
        this.color = color;
    }

    public void ShowColor(){
        System.out.println("Цвет машины: " + color);
    }

    public void ChangeColor(String color3){

    }
}
