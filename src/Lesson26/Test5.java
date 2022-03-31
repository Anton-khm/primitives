package Lesson26;

public class Test5 {
    {
        System.out.println("Eto init block3");          // initializer block, срабатывает после static
    }
    Test5 (){
        System.out.println("Eto constructor1");
    }
    Test5 (int a){                                  // перед срабатыванием второго конструктора, срабатывают все
                                                     // нон статик инит блоки
        this();     // внутри себя вызывается оверлоадед конструктор1
        System.out.println("Eto constructor2");
    }
    static  {
        System.out.println("Eto static init block1");          // static initializer block, срабатывает первым
    }
    {
        System.out.println("Eto init block1");          // initializer block
    }
    static  {
        System.out.println("Eto static init block2");          // initializer block
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);
    }
}
