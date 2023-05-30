package Homework.homework10.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " strings:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String meaning = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = meaning;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
