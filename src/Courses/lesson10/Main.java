package Courses.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Память делится на стек и хэп
        //Строки хранятся в Хэпе - Пул строк
        //Строки можно переиспользовать

        //Строки можно создавать вне пула строк
        /* String string = new String("Mad");



        String hello = "hello";
        System.out.println(hello + " world");
        //В памяти три разных обьекта, строки неизменяемы
        String line = " Group 67 ";

        System.out.println("hello".length());
        System.out.println(line.length());
        //Длина включая пробелы и символы
        //Можно к переменной, можно к значению

        System.out.println(line.trim());
        //Убирает пробелы по краям

        System.out.println(line.charAt(5));
        //Достает определенный символ по индексу

        System.out.println(line.indexOf("p"));
        //Достает индекс символа

        System.out.println(line.concat("Bool"));
        //Конкатенация строк (плюсует строку)

        System.out.println(line.substring(3, 5));
        //С какого по какой символ вырезать

        System.out.println(line.replace("G", "O"));
        //Заменяет символ на заданный

        System.out.println(line.equals("Group"));
        //Сравнивание строк

        System.out.println(line.toLowerCase());
        //Все буквы маленькие, точно такой же с большими toUpperCase()

        System.out.println(line.compareTo("Group"));
        //Тоже сравнение, возвращает цифру, а не boolean

        System.out.println(line.equalsIgnoreCase(" GROUP 67 "));
        //Сравнивает не обращая внимания на регистр

        System.out.println(line.replaceAll("d{4}", "6"));
        //Может принимать регулярные выражения

        //Нужно оббращаться к массиву
        System.out.println(Arrays.toString(line.getBytes()));
        //Преобразовать в массив байтов

        System.out.println(Arrays.toString(line.toCharArray()));
        //Преобразовать в массив символов

        System.out.println(Arrays.toString(line.split(" ")));
        //Разделить строку по делителю

        System.out.println(line.startsWith("2"));
        //Передает булевское значение  правда или ложь то, с чего начинается строка
        //Есть такой же только с чего заканчивается строка endsWith

        System.out.println(line.contains("Gr"));
        //Проверяет, есть ли в строке заданная комбинация

        System.out.println(line.isEmpty());
        //Проверяет пустая ли строка учитывая с пробелами

        System.out.println(line.isBlank());
        //Не учитывает пробелы

        System.out.println(line.repeat(2));
        //Повторить строку некое количество раз

        System.out.println(line.stripLeading());
        //Убирает пробелы слева

        System.out.println(line.stripTrailing());
        //Убирает пробелы справа



        line = line.intern();
        System.out.println(line);
        //Перекладывает строку в Пул строк


        String block = """
                Hello Poland!
                Where are you?
                """;
        //Строчный блок
        System.out.println(block);


        System.out.println("asad" + 234);
        //Все преобразуется в строку

        System.out.println(String.valueOf(5)); // "5"
        //Преобразует типы в строки

        System.out.println();

*/

        String your = "your";
        String welcome = "welcome";

        your += welcome;
        your.concat(welcome);
        your.equals(welcome);
        your.equalsIgnoreCase(welcome);
        your.substring(3);
        your.length();
        your.indexOf("r");
        String.valueOf(true);
        welcome.toUpperCase();
        welcome.replace('1','%');
        welcome.trim();
        welcome.isBlank();
        welcome.split(" ");


        StringBuilder stringBuilder = new StringBuilder("Hello world");
        stringBuilder.append("This is the end of line");
        //Добавить символы в конец строки

        stringBuilder.delete(4,5);
        //Удалить с какого то символа по какой то

        stringBuilder.deleteCharAt(4);
        //Удалить именно по индексу

        stringBuilder.insert(3, "BYE");
        //Добавление в середину от какого то индекса

        stringBuilder.reverse();
        //Зеркально отражает строку

        stringBuilder.toString();
        //Сделать из СтрингБилдера строку

        //Разница между Билдер и Баффер - Баффер используется в многопоточной среде
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);



        StringBuilder stringBuilder2 = new StringBuilder("Hello world");
        stringBuilder2.append("xxxx");
        stringBuilder.insert(5, "y");
        stringBuilder2.delete(3,6);
        stringBuilder2.reverse();
        String builder = stringBuilder2.toString();
        System.out.println(builder);
    }
}
