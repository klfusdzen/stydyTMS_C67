package Courses.arraysLesson;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysLesson2 {
    public static void main(String[] args) {
        //int[] array = {1, 4, 7, 0, 3};
        //int[] finalArray = {0, 0, 0, 0, 9};


        //For each  отличается от For тем, что у него только 2 области, в отличии от 3 в цикле For, справа - то, что хотим перебрать
        //В левую часть записываем переменную с любым названием, но того же типа
        //Цикл For Each поочередно перебирает каждый элемент массива ( не обращается к индексу)
        /* for (int number : array){
            System.out.println(number);//Не позволяет менять или сохранять изменения и данные, For each используется для просмотра
            //Отличается простотой, его никак не сломать
        } */

        //Сортировка массива
        /* Courses.arraysLesson.Arrays.sort(array);
        System.out.println(Courses.arraysLesson.Arrays.toString(array));

        //Поиск элеменов
        System.out.println(Courses.arraysLesson.Arrays.binarySearch(array, 3)); //выведет индекс
        //Для бинарного поиска нужно отсортировать массив по возрастанию
        */

        //Копирование массивов
        //System.arraycopy(array, 1,finalArray,1,2); //Так уже не работают
        //System.out.println(Courses.arraysLesson.Arrays.toString(finalArray));

        //Создание n-мерных массивов
        //int[][] binArray = new int[3][4]; //строки и столбцы
        //Может добавлять [] для создания бесконечных рядов в массивах
        //binArray[1][2] = 100;

        //Определение длины одного ряда массива
        //System.out.println(binArray[2].length);

        //Сравнение 2 массивов между собой
        //int[] a = {1, 4, 5};
        //int[] b = {3, 6, 8,};

        //System.out.println(Courses.arraysLesson.Arrays.equals(a, b)); //В многомерных добавляем deepEquals вместо equals

        //System.out.println(Courses.arraysLesson.Arrays.deepToString(binArray));

        //Random random = new Random();
        //random.nextInt(); //Псевдослучайное число (Числа генерируются по определенному паттерну, который можно вычислить)

        int[][] array = new int[3][3];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
