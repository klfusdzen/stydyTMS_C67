package Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Task1
        /* int n, arr[];                       //Рандомно подбирает элементы массива
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * n);
        for (int i : arr)
            System.out.print(i + " "); */
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }

        //Task2
        System.out.println(" Элементы в прямом порядке");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        /*System.out.println("Элементы в обратном порядке");   //Перебор в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        } */

        //Task3
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Самый большой элемент массива: " + max);
        System.out.println("Индекс максимального элемента: " + maxIndex);

        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Самый маленький элемент массива: " + min);
        System.out.println("Индекс минимального элемента: " + minIndex);

        //Task4
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) count++;
        }
        System.out.println(count != 0 ? "Нулевых элементов в массиве: " + count : "Нулевых элементов в массиве не обнаружено");

        //Task5
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Массив после изменения:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Task6
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("Последовательность не возрастающая");
                    break;
                }
            }
            if (i == array.length - 1)
                System.out.println("Последовательность возрастающая");
        }
    }
}