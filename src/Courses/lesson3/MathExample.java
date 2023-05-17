package Courses.lesson3;

import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        /* int x = 10;
        int y = 5;
        System.out.println(Math.max(x,y)); //максимальное значение из двух чисел
        System.out.println(Math.min(x,y)); //минимальное значение из двух чисел
        System.out.println(Math.round(x,y)); //округлить по правилам математики
        System.out.println(Math.floor(x,y)); //округлить в меньшую сторону
        System.out.println(Math.ceil(x,y)); //округлить в большую сторону
        System.out.println(Math.sqrt(x,y)); //найти квадратный корень
        System.out.println(Math.pow(3,10)); //возвести первое число в степень (второе число)
        System.out.println(Math.abs(3,10)); //модуль
        System.out.println(Math.cos(3,10)); //косинус
        System.out.println((int) (Math.random() * 10)); //рандом от 0 до 1 (не целые числа)
        // чтоб получить целые умножаем на 10 и приводим к int, не забывай про скобки!


        for (int i = 1; i <= 10; i++) {
            System.out.print((int) (Math.random() * 10));  //создаем рандомные целые числа 10 раз
        }
    } */
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * n);
        for (int i : arr)
            System.out.print(i + " ");


    }
}
