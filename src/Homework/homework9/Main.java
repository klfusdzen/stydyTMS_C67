package Homework.homework9;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("maxim550", "maxim100");
        User user2 = new User("maxim550", "maxim100");
        User user3 = new User("maxim550", "maxim100");
        User user4 = new User("maxim550", "maxim100");
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
        System.out.println(user3.equals(user4));
    }
}
