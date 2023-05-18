package Homework.homework7.task1;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Wow wow!");
    }

    @Override
    public void eat(String food) {
        if (food == getMeat()) {
            System.out.println("I like meat!");
        }
        else
        {
            System.out.println("Fuuuuuu");
        }
    }
}
