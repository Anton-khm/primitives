package Lesson14;

public class Test5 {
    public static void main(String[] args) {
         for(int i=1; i<=10; i++){            // break прерывает цикл for
                                             // Вывод: 1,2,3,4,5,6
             if(i==7){
                 break;
             }
             System.out.println(i);
         }
    }

    /*
     public static void main(String[] args) {
         for(int i=1; i<=10; i++){            // continue пропускает при выводе то значение которое указано в условии if
                                                Вывод: 1,2,3,4,5,6,8,9,10
             if(i==7){
                 continue;
             }
             System.out.println(i);
         }
    }

       public static void main(String[] args) {
         for(int i=1; i<=10; i++){            //
                                                Вывод: 1,2,3,4,5,6,8
             if(i == 7){
                 continue;
             }
              if(i % 9 == 0){
                 break;
             }
             System.out.println(i);



     */
}
