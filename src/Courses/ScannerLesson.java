package Courses;

import java.util.Scanner;
public class ScannerLesson {
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // new - выделяем память под обьект сканнер
        // System.in - бери данные из клавиатуры
        // сканер один на весь класс
        scanner.nextInt();
        int result = scanner.nextInt();
        //String secondResult = scanner.nextLine(); //ввод текста в консоли

        System.out.println(result);
        //System.out.println(secondResult);  //принт результата ввода текста
    } */

    /* public static void main(String[] args) {   //по идее это проверка на то, что вводит пользовтель
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        if (scanner.hasNextInt()){
            result = scanner.nextInt();
        } */


    /* public static void main(String[] args) {    //так не работает, только или число, или текст
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String line = scanner.nextLine();

        System.out.println(number);
        System.out.println(line);

     */

    public static void main(String[] args) {  //не баг, а фича - чисто на подумать возможность запустить все вместе
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(a);
        System.out.println(b);
    }
}
