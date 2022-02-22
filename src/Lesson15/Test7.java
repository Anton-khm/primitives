package Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;

        do {
            System.out.println("delaite stavku");
            System.out.println("vi proigrali");

            money -= 10;
        }
        while (money > 50);
    }
}
