package Lesson22;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    // паблик методы работают с приват переменными
    private boolean clever;

    public boolean isClever(){
        return clever;
    }

    private String name;           // для переменной name применили инкапсуляцию, создали 2 метода: для показа и изменения имени

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
