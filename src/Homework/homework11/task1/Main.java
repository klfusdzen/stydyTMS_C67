package Homework.homework11.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line:");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
