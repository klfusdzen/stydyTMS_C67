package Homework.homework9.task2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        User user1 = new User(123456, 1, new PC("iMac"));
        User user2 = new User(678965, 2, new PC("Asus"));
        User userCloned1 = (User) user1.clone();
        User userCloned2 = (User) user2.clone();
        System.out.println(user1 + "\n" + userCloned1);
        System.out.println(user2 + "\n" + userCloned2);
        userCloned1.getPC().setName("Z-Tech");
        userCloned2.getPC().setName("Jet Wizard");
        System.out.println();
        System.out.println(user1 + "\n" + userCloned1);
        System.out.println(user2 + "\n" + userCloned2);
    }
}
