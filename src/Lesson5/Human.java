package Lesson5;

public class Human {
    String name;
    BankAccount bA;


    void info(){
        System.out.println("Name:" +name + "Balans bank scheta: " +bA.balance);
    }
    void popolnenieScheta(double pribavka){
        System.out.println("SummaDoPopolneniya:" + bA.balance);
        System.out.println("SummaPopolneniya:" + pribavka);
        bA.balance += pribavka;
        System.out.println("SummaPoslePopolneniya:" + bA.balance);
        System.out.println();
    }
    void snyatieSoScheta(double ubavka){
        System.out.println("SummaDoSnyatiya:" + bA.balance);
        System.out.println("SummaSnyatiya:" + ubavka);
        bA.balance -= ubavka;
        System.out.println("SummaPosleSnyatia:" + bA.balance);
        System.out.println();
    }
}

    class HumanTest{
        public static void main(String[] args){
            Human h = new Human();
            h.name = "David";
            h.bA = new BankAccount(18, 1000);
            h.info();
            h.popolnenieScheta(100);
            h.snyatieSoScheta(50);
        }
    }
    class BankAccount {
        BankAccount(int id2, double balance2){
            id = id2;
            balance = balance2;
    }
        int id;
        double balance;
}