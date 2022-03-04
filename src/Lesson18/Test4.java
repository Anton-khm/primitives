package Lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Arrays.sort(array1);                // метод сортирует массив. Массив был отсортирован от меньшего значения к большему
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        int index1 = Arrays.binarySearch(array1, -8 );       // выводит индекс, на котором находится число -8 в отсортированном массиве

        /* если элемента с таким значением нету в массиве, то например:
        0 1 2 4 5
        binarySearch(array, 3) выведет на экран -2
        Это будет индекс на котором мог бы находиться элемент и отнять от этого единицу (index - 1)
       К результату добавляется минус.
         */

        System.out.println(index1);
    }
}
