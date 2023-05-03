//Управляющие конструкции

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork2 {
    //Task1
    /* public static void main(String[] args) {
        int month = 4;
        switch (month) {
            case 1, 2, 12 -> System.out.println("Сейчас зима");
            case 3, 4, 5 -> System.out.println("Сейчас весна");
            case 6, 7, 8 -> System.out.println("Сейчас лето");
            case 9, 10, 11 -> System.out.println("Сейчас осень");
        }
    } */

    //Task2
    /* public static void main(String[] args) {
        int month = 4;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Сейчас зима");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Сейчас весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Сейчас лето");
        }
        else {
            System.out.println("Сейчас осень");
        }
    } */

    //Task3
    /* public static void main(String args[]) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //Пришлось разобраться, как работает метод nextInt
        //Я считываю с консоли целое число от 1 до 10 с помощю метода nextInt и присваиваю переменной num
        if ( num % 2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    } */

    //Task4
    /* public static void main(String[] args) {
        System.out.print("Введите температуру: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t > -5) {
        System.out.print("Тепло");
        } else if (t > -20) {
            System.out.println("Нормально");
        } else  {
            System.out.println("Холодно");
        }
    } */


//Циклы
//Task1
    /* public static void main(String[] args) {
            for (int i = 0; i <= 99; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
    } */

//Task2
    /* public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
    } */

//Task3
    /* public static void main(String args[]) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    } */

//Task4
    /* public static void main(String[] args) {
        int a = 7;
        while (a <= 98) {
            System.out.print (a+" ");
            a = a + 7;
        }
    } */

    //Task5
    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.print(i + " ");
        }
    }

//Task6

    /* public static void main(String[] args) {
        for (int i = 10; i <= 20; i++)
            System.out.print(i * i + " ");
    } */

}
