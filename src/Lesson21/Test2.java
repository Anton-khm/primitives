package Lesson21;

public class Test2 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("privet");
        s2 = new String("poka");
        s1 = s2;                            // s1 и s2 начинают ссылаться на один объект
        String s3 = s1;             // s3 начинает ссылаться на тот же объект
        s1 = null;             // s1 перестает ссылаться на объект
    }
}

/*
class Test{
    public Test(){       рекурсия -- вызов самого себя.  конструктор до бесконечности будет вызывать сам себя
        this();
    }
}*/
