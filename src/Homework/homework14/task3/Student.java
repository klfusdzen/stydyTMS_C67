package Homework.homework14.task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private int grade;
    private static List<Student> list = new ArrayList<>();
    //переменные и коллекция с обьектами класса студент

    public static List<Student> getList() {
        return list;
    }

    public static void setList(List<Student> list) {
        Student.list = list;
    }
    //сеттер-геттер

    public Student(String name, int group, int course, int grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }
    //конструктор

    public static void remove(){
        for (int i = 0 ; i< list.size(); i++){
            if (list.get(i).grade < 3){
                list.remove(i);
            }
        }
    }
    //метод удаления


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    //геттеры-сеттеры

}
