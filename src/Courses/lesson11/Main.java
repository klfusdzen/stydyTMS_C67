package Courses.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Регулярные выражения
        String testLine = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        String testLine2 = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        String pattern = "[A-z0-9]{2}"; //Что мы ищем "[A,b,C] и количество {1}"

        //Правая часть:
        //Задать диапазон {2,5}
        //Задать диапазон до бесконечности {2,}
        //В конструкции "[A-z]?" означает "1 или отсутствует"
        // "^Hello$!";
        //Может быть, а может не быть и выполнить (ели есть минус) "-?[1-9]{2}";
        //ОТ нуля до бесконечности "[1-3]*";

        //Левая часть
        //Любой, кроме перечисленных "[^A-B]{2}";
        //Два диапазона "[^A-B[1-3]]{2}";
        //Можно сокращать "\\d{1};     Спецсимволы:
        // \\d - любые цифры
        // \\D - все, кроме цифр
        // \\s - ищи проблеы
        // \\s+{2}  - ищи пробелы от 2 и замени на 1
        // \n - перенос на следущую строку
        // \t - табуляция
        // ".+" - ищи все что угодно до бесконечности
        //Ищи вначале ^ "[A-z0-9]{2}$";   Ищи в конце $

        //Паттернов может быть сколько угодно

        String pattern2 = "[A-z]{1}";
        //System.out.println(testLine.replaceAll(pattern2, "&")); //Можно так
        //System.out.println(testLine.replaceAll("[A-z]{1}", "&")); //Можно и так

        Pattern pattern3 = Pattern.compile("\\d{1}");
        Matcher matcher = pattern3.matcher(testLine);
        //Вот строка, примени к ней паттерн
        //Отличие в том, что матчер будет сам искать вхождения, только найти, не менять
        //Для вывода используется цикл
        //Подходящие под паттерн сочетания символов называют группой
        while (matcher.find()){
            System.out.println(matcher.group());
            //System.out.println("Index:" + matcher.start());
            //System.out.println(matcher.end());
        }

        Pattern pattern4 = Pattern.compile("@[a-z]+");
        Matcher matcher2 = pattern4.matcher(testLine);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        Pattern pattern5 = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");
        Matcher matcher3 = pattern5.matcher(testLine2);
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }
    }
}
