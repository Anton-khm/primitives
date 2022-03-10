package Lesson21;

public class Test7 {

    int a = 5;
    int l = 4;
    int t,h=5,k;


    public void abc (int a, double b){
        System.out.println("privet");
    }
    public void abc(double a, int b){
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
    //    t.abc(1,2);                       джава не понимает какой параметр вызывается, потому что параметры одинаковые
    }
}
