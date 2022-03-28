//package Lesson25;
//
//import Lesson10.p4.D;
//
//public class Test1 {
//    public static void main(String[] args) {
//        Driver [] array1 = {new Driver(), new Driver()};
//        Employee [] array2 = {new Driver(), new Teacher(), new Doctor()};
//        Help_able [] array3 = {new Driver(), new Teacher(), new Doctor()};
//
//        Employee emp1 = new Teacher();
//        Employee emp2 = new Driver();
//        Employee emp3 = new Doctor();
//        Employee [] array4 = {emp1, emp2, emp3};
//
//        System.out.println(emp1 instanceof Employee);
//
////        for(Employee emp: array4){   // пример полиморфизма, в зависимости от того какой объект вызывается срабатывает
////                                // определенное тело метода
////            emp.work();
////        }
//
//        Help_able h = new Teacher();
//        emp1.help();
//
//        emp1.work();
//        emp2.work();
//        emp3.work();
//    }
//}
//
//abstract class Employee implements Help_able{
//    void sleep(){
//        System.out.println("Employee sleeps");
//    }
//    abstract void work();
//}
//
//class Teacher extends Employee{
//    public void help(){
//        System.out.println("Teacher helps");
//    }
//    void work(){
//        System.out.println("Teacher works");
//    }
//}
//class Driver extends Employee{
//    public void help(){
//        System.out.println("Driver helps");
//    }
//    void work(){
//        System.out.println("Driver works");
//    }
//}
//class Doctor extends Employee{
//    public void help(){
//        System.out.println("Doctor helps");
//    }
//    void work(){
//        System.out.println("Doctor works");
//    }
//}
//interface Help_able{
//    void help();
//}