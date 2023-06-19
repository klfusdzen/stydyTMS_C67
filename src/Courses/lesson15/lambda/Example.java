package Courses.lesson15.lambda;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        //Создаем лямбду
        FuncInterface firstLambda = (a, b) -> a + b;

        BinaryOperator<Integer> thirdLambda = (a, b) -> a + b;
        //Бинарный оператор
        //Есть так же унарный

        Predicate<Integer> pl = (number) -> number % 2 == 0;
        //Лямбда, которая проверяет ппараметр вместо метода
        System.out.println(pl.test(5));

        Consumer<Integer> cl = System.out::println;
        //Ссылка на метод

        int x = 10;
        Supplier<Integer> sl = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        };
        //Не принимает параметры, но возвращает значение
        //Что то достаем из базы и возвращаем

        Function<String, Integer> fl = Integer::parseInt;
        //Указываем что приходит на вход, потом указываем, что отдает



        //Использование лямбды
        int result = firstLambda.sum(1, 5);
        System.out.println(result);
    }
}
