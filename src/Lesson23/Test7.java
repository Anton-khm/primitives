package Lesson23;

public class Test7 {

}

class Animal3 {
    static String showName() {
        return "some Animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse3 extends Animal3 {
    static String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse(){
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouse3 a = new Mouse3();
        a.showInfoAboutAnimal();   // метод есть в классе Mouse, и так как showName -- static то здесь работает hiding,
        // и showName перезаписываться не будет. Будет выводиться "some Animal"
        a.showInfoAboutMouse();
    }
}

