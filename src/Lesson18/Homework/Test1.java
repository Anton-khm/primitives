package Lesson18.Homework;

public class Test1 {
    public static int[] sortirovka(int[] array) {
        int a;

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {-7, -10, 4,32,15,9};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}