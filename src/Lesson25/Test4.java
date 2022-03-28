package Lesson25;

public class Test4 {
    public static void main(String[] args) {
        String [] array1 = {"privet", "poka"};
        Object [] array2 = array1;  // любой массив это массив типа object
        String [] array3 = (String[]) array2; // поверь что array2 это массив типа стринг
    //    array3[0] = new StringBuilder("ok");  // так нельзя написать потому что тип array3 это стринг
        array2[0] = new StringBuilder("ok");  // так написать можно потому что тип array2 это обджект.
        // Но все равно будет эксепшн, потому что array2 ссылается на стринг
    }
}

