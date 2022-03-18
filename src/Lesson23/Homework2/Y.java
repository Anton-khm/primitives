package Lesson23.Homework2;

import Lesson23.Homework.*;

public class Y extends X{

//    public void abc(){
//        System.out.println("Y");
//    }
//    public void def(){
//        Y y = new Y();
//        y.abc();
//    }
//    public void ghi(){
//        X x = new Y();
//   //     x.abc();   так как abc в классе Х имеет протектед аксесс модифайер,
//   то метод abc не вызовется для переменной х. Будет ошибка компиляции.
//    }
//
//    public static void main(String[] args) {
//        Y a = new Y();
//        a.abc();
//        a.def();
//        a.ghi();
//    }
    public Y(int i){
        System.out.println("Y");
    }
    public boolean abc(){return true;}
}
