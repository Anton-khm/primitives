package Lesson14;

public class Test1 {
    public static void main(String[] args) {

        for(int i =1; i<11; i++, abc(10)){           // i -- локальная переменная, видна только внутри for
            System.out.println(i);
        }
    }
    static void abc(int n){
        System.out.println(n);
    }

    /*
    for(int i =1; i<11; ){           // update statement (i++) можно указывать не внутри условия for
            System.out.println(i);
            i++;
        }

        for(int i =1; ; i++){           // можно не указывать condition statement (i<11), получается бесконечный цикл
                                           всегда приравнивается к true
            System.out.println(i);
        }
     */
}
