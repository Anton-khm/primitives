package Lesson25.Homework;

public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Animal1");
        Animal a2 = new Pingvin("Animal2");
        Animal a3 = new Lev("Animal3");
        Fish f1 = new Mechenosec("Fish1");
        Bird b1 = new Pingvin("Bird1");
        Mammal mam1 = new Lev("Mammal1");
        Mechenosec mech1 = new Mechenosec("Mechenosec1");
        Pingvin p1 = new Pingvin("Pingvin1");
        Lev l1 = new Lev("Lev1");
        Speakable sp1 = new Pingvin("Pingvin2");
        Speakable sp2 = new Lev("Lev2");
        Animal [] array1 = {a1, a2, a3, f1, b1, mam1, mech1, p1, l1};
        Speakable [] array2 = {sp1, sp2, b1, mam1, p1, l1};
            for(Animal a: array1){
                if(a instanceof Mechenosec){
                    Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            }
              else if(a instanceof Pingvin){
                    Pingvin p = (Pingvin) a;
                    System.out.println(p.name);
                    p.eat();
                    p.sleep();
                    p.fly();
                    p.speak();
                }
              else if(a instanceof Lev){
                  Lev l = (Lev)a;
                    System.out.println(l.name);
                    l.speak();
                    l.eat();
                    l.run();
                    l.sleep();
                }
                System.out.println("-----------------------------");
        }
            for (Speakable sp: array2){
                if(sp instanceof Pingvin){
                    Pingvin p = (Pingvin) sp;
                    System.out.println(p.name);
                    p.speak();
                    p.eat();
                    p.fly();
                    p.sleep();
                }
                else if(sp instanceof Lev){
                    Lev l = (Lev) sp;
                    System.out.println(l.name);
                    l.eat();
                    l.speak();
                    l.run();
                    l.sleep();
                }
                System.out.println("---------------------------------");
            }

    }
}

abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;       // this означает назначить переменной name из класса Animal перменную конструктора Animal
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish (String name){
        super(name);       // назначаем значение параметра name, переменной name родительского (супер) класса
        this.name = name;
    }

    void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird (String name){
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal (String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {

    Mechenosec(String name){
        super(name);
        this.name = name;
    }

    void swim(){
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    void eat(){
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}

class Pingvin extends Bird {

    Pingvin (String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Pingvin lyubit est ribu!");
    }
    void sleep(){
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
    void fly(){
        System.out.println("Pingvini ne umeyut letat!");
    }
    public void speak(){
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

class Lev extends Mammal {

    Lev(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Lev, kak lyuboi xishnik, lyubit myaso!");
    }
    void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit!");
    }
    void run(){
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }
}


