package Homework.homework7.task2;

public class Dog {
    private static String meat = "Meat";

    private Dog(){
        System.out.println("You create dog");
    }

    public static String getMeat() {
        return meat;
    }

    static void voice() {
        System.out.println("Wow wow!");
    }

    static void eat(String food) {
        if (food == getMeat()) {
            System.out.println("I like meat!");
        } else {
            System.out.println("Fuuuuuu");
        }
    }
}
