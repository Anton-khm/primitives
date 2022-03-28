package Lesson25;

public class Test2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if(j instanceof Jumpable){
            System.out.println("j is Jumpable");
        }
        if(m instanceof Human){
            System.out.println("m is Human");
        }
//        if(s instanceof Human){               между Student и Human никакой связи нет, компилятор ругается.
//            System.out.println("s is Human");
//        }
        if(s instanceof Jumpable){              // компилятор не знает имплементировал ли сабкласс Студент Jumpable.
                                                // поэтому компилятор не ругается. Но в условии будет false.
            System.out.println("s is Jumpable");
        }
    }
}

interface Jumpable{}
class Human implements Jumpable{}
class Man extends Human{}
class Student{}
