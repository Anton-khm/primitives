package Lesson24.Homework;

public class Test1 {
    public static void main(String[] args) {
        Mechenosec mech1 = new Mechenosec("Mechenosec Ivan");
        System.out.println(mech1.name);
        mech1.eat();
        mech1.sleep();
        mech1.swim();
        Speakable sp1 = new Pingvin("Pingvin Petya");
        sp1.speak();
        Animal an1 = new Lev("Animal 1");
        System.out.println(an1.name);
        an1.eat();
        an1.sleep();
        Mammal mam1 = new Lev("Mammal 1");
        System.out.println(mam1.name);
        mam1.eat();
        mam1.sleep();
        mam1.run();
        mam1.speak();
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

abstract class Fish extends Animal{

    Fish (String name){
        super(name);       // назначаем значение параметра name, переменной name родительского (супер) класса
        this.name = name;
    }

    void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{

    Bird (String name){
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable{

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

class Mechenosec extends Fish{

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

class Pingvin extends Bird{

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

