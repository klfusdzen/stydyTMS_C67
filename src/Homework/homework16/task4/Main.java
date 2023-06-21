package Homework.homework16.task4;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        String str = "740 BYN";
        Consumer<String> consumer = (string) -> System.out.println(Double.parseDouble(string.replaceAll(" BYN", "")) / 3.02 + " USD");
        consumer.accept(str);
    }
}