package Lesson13;

public class Test1 {
}

class Student{
    int grade;
    Student(int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);

      /*  if(st1.grade==2){
            System.out.println("Student dvoechnik");
        } else if (st1.grade==3){
            System.out.println("Student troeshnik");
        } else if (st1.grade==4){
            System.out.println("Student horoshist");
        } else if (st1.grade==5){
            System.out.println("Student otlichnik");
        } else {
            System.out.println("Ocenka neverna");
        }
    }   */

        switch (st1.grade) {               // switch означает что будет что то сравнивать
            case 2:
                System.out.println("Student dvoechnik");
               break;                  // break означает что мы выходим из тела switch'a
            case 3:
                System.out.println("Student troeshnik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default:                 // срабатывает, когда не срабатывает ни один из case'ов
                System.out.println("Ocenka neverna");
        }
    }
}