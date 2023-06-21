package Homework.homework16.task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        Predicate<Integer> predicate = integer -> integer > 0;
        for (int value : array){
            if (predicate.test(value)){
                System.out.print(value + " ");
            }
        }
    }
}
