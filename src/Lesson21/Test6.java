package Lesson21;

public class Test6 {
    int abc() {
        return 5;
    }

    int abc2(int i){
    if(i>10){return 5;}
    else {return 10;}
    }

    void abc3(){
        System.out.println("Hello");
        return;
      //  System.out.println();        не сработает потому что return это последний элемент в методе, после него ничего писать нельзя
    }

    public static void main(String[] args) {
        int a = new Test6().abc();         // переменной a присваивается значение метода abc
        new Test6().abc();
    }
}
