package Lesson12;

public class Test12 {

    void maximum(int i1, int i2, int i3){
        if(i1>i2 && i1>i3){
            System.out.println("Maximum -" + i1);
        }
        else if (i2>i1 && i2>i3){
            System.out.println("Maximum - " + i2);
        }
        else {
            System.out.println("Maximum - " + i3);
        }
    }

    public static void main(String args[]){
        Test12 t = new Test12();
        t.maximum(4, 7, 0);
    }
}

class IfElse {
    public static void main(String args[]) {
        int month = 4; // Апрель
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "зиме";
        else if (month == 3 || month == 4 || month == 5)
            season = "весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "лету";
        else if (month == 9 || month == 10 || month == 11)
            season = "осени";
        else
            season = "вымышленным месяцам";
        System.out.println("Апрель относится к " + season + ".");
    }
}

/*public class Test13 {
    void abc(){
        String str;
        int a =5;
        if (a>=10){
            str="privet";
        }
        if(a<1){
            str="poka";
        }
        System.out.println(str);   // обязательно должен быть else
    }
}*/

class Test13 {
    public static void main(String[] args){

        int a =10;
        int b =20;
        int maximum=(a>b)?a:b;        //ternary operator

        System.out.println(maximum);
    }
}