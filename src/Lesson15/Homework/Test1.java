package Lesson15.Homework;
/*
Домашнее задание из 14 урока, только переписанное с while loop
 */
public class Test1 {
    static void method1() {
        int chas = 0;

        OUTER:
        while (chas <= 6) {

            int minuta = -1;

            MIDDLE:
            do {
                minuta++;

                if (chas > 1 && minuta % 10 == 0){
                    break OUTER;
                }

                int sekunda = 0;

                INNER:
                while (sekunda <= 59) {

                    if (sekunda * chas > minuta){
                        continue MIDDLE;
                    }


                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                    sekunda++;
                }
            }
            while (minuta < 59);

            chas++;
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
