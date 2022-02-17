package Lesson12;

import Lesson10.p1.p2.p3.C;

public class Car {

    int engine;
    int doorCount;

    Car (int engine, int doorCount){
        this.engine=engine;
        this.doorCount=doorCount;
    }
}

class carTest {
    public static void main(String args[]){
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2,5);

        if(c1.engine> c2.engine){
            if(c1.doorCount> c2.doorCount){
                System.out.println("Moschnost motora i kolichestvo dverey u pervoi maschiny bolshe");}
            else{
                System.out.println("Moschnost motora u pervoi mashiny bolshe, a kolichestvo dverey menshe");}}
            /* всегда нужно
                смотреть на внутренний if и else. Если нету скобок от них нужно брать отсчет. */
            else
                System.out.println("Moshnost motora u pervoi mashiny menshe");
// если условие в if -- false, то все что внутри фигурных скобок не выполняется, а выполняется else
    }
}
