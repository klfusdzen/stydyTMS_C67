package Homework.homework12.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        user1.setLogin(scanner.nextLine());
        System.out.println("Enter password: ");
        user1.setPassword(scanner.nextLine());
        System.out.println("Enter confirm password: ");
        user1.setConfirmPassword(scanner.nextLine());

        try {
            System.out.println(User.enter(user1.getLogin(), user1.getPassword(), user1.getConfirmPassword()));
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception);
        }
    }
}
