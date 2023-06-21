package Homework.homework16.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input date your BD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(input);
        System.out.println(localDate.plusYears(100));
    }
}
