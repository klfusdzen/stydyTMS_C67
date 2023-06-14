package Homework.homework14.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arrayString = string.split(",");
        Set<String> hashSet = new HashSet<>(Arrays.asList(arrayString));
        System.out.println(hashSet);
    }
}
