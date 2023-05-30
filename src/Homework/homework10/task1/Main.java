package Homework.homework10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Enter " + array.length + " strings:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        String shortest = array[0];
        String longest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (shortest.length() >= array[i].length()) {
                shortest = array[i];
            }
            if (longest.length() <= array[i].length()) {
                longest = array[i];
            }
        }
        System.out.println("Longest string: " + longest);
        System.out.println("Shortest string: " + shortest);
    }
}