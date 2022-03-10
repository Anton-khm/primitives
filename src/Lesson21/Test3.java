package Lesson21;

public class Test3 {
    Test3(){                                     // у конструктора нету return type (void)
        System.out.println("Eto constructor");
    }
    void Test3(){                         // у метода есть return type (void)
        System.out.println("Eto metod");
    }

}

class A{
    public static void main(String[] args){
        Test3 t = new Test3();
    }
}
