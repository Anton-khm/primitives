package Lesson18;

public class Test5 {
    public static void main(String[] args) {        // слово args можно менять на любое
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        array1[1]=0;
        array2[5-3]=3;
        array1[array1.length]=10;  // exception потому что элемента с индексом 10 нету у массива выше

        //int array3[] = array2;
       // System.out.println(array3 == array2);  true
       // System.out.println(array1.equals(array2));  // false -- метод equals работает для массивов как 2 равно (==)
    }
}
