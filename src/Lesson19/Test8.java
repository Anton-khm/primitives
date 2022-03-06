package Lesson19;

public class Test8 {
    public static void main(String[] args) {
      /*  int [] array = {0,6,4,1};
        for(int a:array){
            a=3;                            // значение 3 не меняет массив для int
        }
        for(int i=0;i<array.length; i++){
            System.out.print(array[i] + " ");
        }*/

        String[] array = {"privet", "poka", "ok"};
        for (String s : array) {
            s = new String("hello");     // значение hello не меняет массив для String
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");

        StringBuilder[] array2 = {sb1, sb2, sb3};
        for (StringBuilder sb : array2) {
           // sb = new StringBuilder("hello");      // значение hello не меняет массив для StringBuilder
            sb.append("Java");                     // с помощью метода мы изменили значение объекта, но сам объект мы не изменим
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
