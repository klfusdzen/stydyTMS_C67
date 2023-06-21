package Homework.homework16.task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Supplier<StringBuilder> supplier = () -> {
            StringBuilder build = new StringBuilder(new Scanner(System.in).nextLine());
            return build.reverse();
        };
        System.out.println(supplier.get());
    }
}
