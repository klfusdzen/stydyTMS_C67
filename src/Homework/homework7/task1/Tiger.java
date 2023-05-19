package Homework.homework7.task1;

public class Tiger extends  Animal {
    @Override
    public void voice() {
        System.out.println("Rrrrr!");
    }

    @Override
    public void eat(String food) {
        if (food == getMeat()) {
            System.out.println("I like meat!");
        } else {
            System.out.println("Fuuuuuu");
        }
    }
}
