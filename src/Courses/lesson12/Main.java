package Courses.lesson12;

public class Main {
    public static void main(String[] args) {
        //Подключаемся к БД
        //try-catch
        int number = 1;

        try {
            System.out.println(10/number);
        } catch (ArithmeticException exception){
            System.out.println("Some arithmetic exception!");
        }
        System.out.println("End of the main method");
    }
}
