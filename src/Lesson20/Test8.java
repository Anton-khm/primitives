package Lesson20;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};
        int [] array3 = {1,2,3,5};

        char[] array4 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array5 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};

        System.out.println(Arrays.compare(array1,array2));  // -1 когда первый массив меньше второго
        System.out.println(Arrays.compare(array2,array1));  // 1 когда первый массив больше второго
        System.out.println(Arrays.compare(array2,array3));  // 0 когда первый массив равен второму

        System.out.println(Arrays.mismatch(array2,array3));  // -1 если массивы совпадают
        System.out.println(Arrays.mismatch(array1,array3));  // 3 если не совпадают, то выводится индекс на котором начинается несовпадение
    }
}
