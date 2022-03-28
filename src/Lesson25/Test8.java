package Lesson25;

public class Test8 {
}

class Animal{}

class Mouse extends Animal{
    void abc(){
        def (new Animal(), new Mouse());
        def((Mouse)new Animal(), new Mouse());  // exception потому что объект new Animal это не какая нибудь переменная, которая
        // сслыается на Mouse, а это конкретный объект класса Animal.
        // а Animal это не Mouse.
    }
    void def (Animal a1, Mouse m1){
        Mouse m2= (Mouse) a1;
        Animal a2 = (Animal) m1;
    }

    public static void main(String[] args) {
        new Mouse().abc();
    }
}