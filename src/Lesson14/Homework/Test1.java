package Lesson14.Homework;

import Lesson14.Test6;

public class Test1 {

    static void method1(){
        OUTER: for(int chas=0; chas<=6; chas++){
           MIDDLE: for (int minuta=0; minuta<=59; minuta++){

                if (chas > 1 && minuta % 10 == 0){
                    break OUTER;
                }
               INNER: for(int sekunda=0; sekunda<=59; sekunda++){
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                    if (sekunda * chas > minuta){
                        continue MIDDLE;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        method1();        // если я вызываю статический метод (static method1), я могу не создавать объект  (test1 t = new test1)
    }
}
