package Homework.homework12.task2;

public class Main {
    public static void main(String[] args) {
        //finally не вызывается тк цикл бесконечен
        try {
            for (int i = 0; i >= 0; i++)
                System.out.println(i++);
        } catch (ArithmeticException exception) {
            System.out.println("Exception");
        } finally {
            System.out.println("Don't touch it");
        }
    }
}
