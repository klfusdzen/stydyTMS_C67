package Homework.homework16.task3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String str = "740 BYN";
        Function<String, Double> function = (string) -> Double.parseDouble(string.replaceAll(" BYN", "")) / 3.02;
        System.out.println(function.apply(str) + " USD");
    }
}
