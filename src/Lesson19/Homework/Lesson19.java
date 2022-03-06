package Lesson19.Homework;

public class Lesson19 {
    public static String[] abc(String[]... array1) {      // массив array1 состоящий из многих одномерных массивов
        int length = 0;
        for (String[] array2 : array1) {                     // одномерный массив array2
            length += array2.length;                   // сумма длин всех одномерных массивов
        }
        String[] target = new String[length];        // массив с длиной length
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bye"});
        // изменять элементы массива target, поэтому traditional for loop
        for (String s : args) {                         //  s - массив который вводится через команд лайн
            for (int i = 0; i < target.length; i++) {     // target - массив который прописан
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }

        }
        for (String s:target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}