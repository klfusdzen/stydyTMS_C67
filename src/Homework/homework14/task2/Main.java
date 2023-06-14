package Homework.homework14.task2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.add("Tiger");
        animal.add("Dog");
        animal.add("Rat");
        System.out.println(animal.getList());
        animal.remove();
        animal.remove();
        animal.remove();
        System.out.println(animal.getList());
    }
}