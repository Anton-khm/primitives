package Lesson22.Homework;

import Lesson22.Chelovek;

public class Student {
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }
    }

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 11) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Имя: " + getName() + " курс: " + getCourse() + " оценка: " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Алекс"));
        st1.setCourse(2);
        st1.setGrade(9);
        st1.showInfo();
//        System.out.println(st1.getName());
//        System.out.println(st1.getCourse());
//        System.out.println(st1.getGrade());
    }
}
