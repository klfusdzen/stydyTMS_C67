package Homework.homework4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += n;
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов двумерного массива = "+sum);
    }
}
