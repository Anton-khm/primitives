package Lesson18;

public class Test3 {
    public static void main(String[] args) {
        int [] array = new int[3];  //

        array[0]=1;    // ArrayIndexOutOfBoundsException
        array[1]=1;
        array[2]=1;
       // array[3]=1;

        int [][] array2=new int[3][];
        System.out.println(array2[0][1]);  // NullPointerException     у объекта нету информации о том, что мы хотим узнать
    }
}
