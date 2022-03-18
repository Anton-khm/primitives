package Lesson23;

public class Test6 {
}

class Animal2 {
    String showName() {
        return "some Animal";
    }

    void showInfo() {
        System.out.println("Name of animal: " + showName());   // вызывайте метод из класса, где он был перезаписан. Тоесть Mouse2
    }
}

class Mouse2 extends Animal2 {
    String showName() {
        return "mouse";
    }

    public static void main(String[] args) {
        Animal2 a = new Mouse2();
        a.showInfo();
    }
}

