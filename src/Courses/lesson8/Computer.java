package Courses.lesson8;

public abstract class Computer {
    //Абстрактный класс не может создавать обьекты, может иметь абстрактные методы
    void getClassName(){
        System.out.println("You create new abstract class");
    }

    //Может содержать конструктор
    private int cost;

    public Computer(int cost){
        this.cost = cost;
    }

}
