package Homework.homework7;

public class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Wow wow!");
    }

    @Override
    public void eat(String food) {
        if (food == getMeat()) {
            System.out.println("I like grass!");
        }
        else
        {
            System.out.println("Fuuuuuu");
        }
    }
}
