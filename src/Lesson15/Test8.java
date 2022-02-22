package Lesson15;

public class Test8 {
    public static void main(String[] args) {
        int chas = -1;

        OUTER:       // выведется на экран включая 24 часа, потому что do выполнится до проверки уловия while<24
        do {
            chas++;
            int minuta = 0;

            INNER:
            while (minuta < 60) {{
                if(minuta==20){
                    continue OUTER;
                }
            }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        }
        while (chas < 24);
    }
}
