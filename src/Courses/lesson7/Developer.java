package Courses.lesson7;

public class Developer {
    public static String name;
    //static int salary = 1000; //Поле статичное, принадлежит только классу, у наследников его не будет
    public final static int SALARY = 1000; //final - нельзя перезаписать, если поле инициализировано

    //Статические методы могут использовать только статические переменные

    public static void sayHello(){
        System.out.println("Hello");
    }

    public Developer(){
        System.out.println("Im working");
    }

    {
        System.out.println("Hello from Pro");
    }

    static {
        name = "Alex";
    }

}
