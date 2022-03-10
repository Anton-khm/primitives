package Lesson20;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("one");
        aL1.add("two");
        aL1.add("three");
        aL1.add("four");
        aL1.add("five");
        for (Object o : aL1) {
            System.out.println("Number = " + o + " and length = " + ((String) o).length());
        }
    }
}