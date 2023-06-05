package Courses.lesson12;

public class Main {
    public static void main(String[] args) {
        //Подключаемся к БД
        //try-catch
        int number = 1;
/*
        try {
            System.out.println(10/number);
        } catch (ArithmeticException exception){
            System.out.println("Some arithmetic exception!");
        }
        System.out.println("End of the main method");*/
        /*try{
            int[] array = {1, 2, 4 ,5 ,3, 6};
            System.out.println(array[9]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exception){
            System.out.println(exception);
        } finally {
            System.out.println(1111111111);
            //Выполняется практически всегда
        }

        if (number > 0){
            throw new FirstException("More than 0");
        }*/

        Person person1 = new Person(17);
        int age = person1.getAge();
        try {
            if (age < 18) {
                throw new AgeException("Access exception your age is " + age);
            } else {
                System.out.println("Your welcome");
            }
        } catch (AgeException exception) {
            System.out.println(exception);
        }
    }
}
