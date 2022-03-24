package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kollichestvoStoron);
        f1.ploschad();
    }
}

abstract class Figura {
    int kollichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploschad();

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura {
    int kollichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }

    public void ploschad() {
        System.out.println("Ploschad kvadrata = " + storona1 * storona1);
    }
}

class XXX extends Kvadrat{}   // метод Kvadrat перезаписал абстрактные методы от родителя, тогда ХХХ метод может не
// перезаписывать абстрактные методы

class Pryamougolnik extends Figura {
    int kollichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 8;

    public void perimetr() {
        System.out.println("Perimetr pryamougolnika = " + 2 * (storona1 + storona2));
    }

    public void ploschad() {
        System.out.println("Ploschad pryamougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kollichestvoStoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }

    public void ploschad() {
        System.out.println("Ploschad okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura{
    void def(){
        System.out.println("Eto chetirexugolnik");
    }
}