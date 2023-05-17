package Courses.lesson7;

public class Developer {
    public static String name;
    //static int salary = 1000; //Поле статичное, принадлежит только классу, у наследников его не будет
    public final static int SALARY = 1000;
    //final - нельзя перезаписать, если поле инициализировано

    //Статические методы могут использовать только статические переменные

    public Developer(){
        System.out.println("Im working");
    }

    static {
        name = "Hello";
    }
    //Экономия памяти

    {
        System.out.println("Hello from Pro");
    }

    static {
        System.out.println("Static block from Pro");
    }
    //Статический блок отрабатывает только один раз при первой инициализации
    //Сначала отрабатываются статические блоки, потом логические и даллее конструктор

    static class Laptop{
        public static String name = "Apple MacBook";
    }

}
