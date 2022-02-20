package Lesson14;

public class Test6 {
    public void time(){

       OUTER: for (int chas=0; chas <= 23; chas++){                 /* label -- управление внешними loop(Outer)
                                                                                 из внутренних loop(inner) */
          INNER:  for (int minuta=0; minuta <= 59; minuta++){
                System.out.println(chas + ":" + minuta);
                if(minuta==30){
                    break OUTER;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
