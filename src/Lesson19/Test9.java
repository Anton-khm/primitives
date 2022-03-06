package Lesson19;

public class Test9 {
    public static void main(String[] args) {
        int[] array = new int[4];             // создаем массив длиной 4

        for (int i = 0; i < array.length; i++){    // динамически инициализируем
            array[i]=i*10;
        }

        for(int a: array){
            System.out.print(a+ " ");
        }
    }
}
