package Homework.homework7.task1;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        rabbit.eat("Grass");
        dog.eat("Grass");
        tiger.eat("Beer");
        rabbit.voice();
        dog.voice();
        tiger.voice();
    }
}
