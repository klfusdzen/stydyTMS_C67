package Homework.homework7.task1;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("uf uf");
    }

    @Override
    public void eat(String food) {
        if (food == getGrass()) {
            System.out.println("I like grass!");
        } else {
            System.out.println("Fuuuuuu");
        }
    }
}
