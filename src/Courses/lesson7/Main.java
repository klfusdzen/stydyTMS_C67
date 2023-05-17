package Courses.lesson7;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.makeSound("Nomad");
//
//        Wolf wolf = new Wolf();
//        wolf.makeSound();
//
//        Cat cat = new Cat();
//        cat.makeSound();

//        Animal animal = new Wolf();
//        animal.makeSound();
        Shape shape = new Shape();
        shape.drow();
        shape.erase();

        Shape circle = new Circle();
        circle.drow();
        circle.erase();

        Shape square = new Square();
        square.drow();
        square.erase();

        Shape triangle = new Triangle();
        triangle.drow();
        triangle.erase();
    }
}
