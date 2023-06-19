package Courses.lesson15;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate dateNow = LocalDate.now();
        //Дай сегодняшную дату
        LocalDate date2 = LocalDate.of(1990,2,2);
        LocalDate date3 = LocalDate.parse("1999-01-01");
        LocalDate date4 = date3.plusDays(10);
        //Года, дни, месяца
        date2 = date2.minusYears(10);


        //System.out.println(date4.getDayOfMonth());
        //Получить дни месяца
        //System.out.println(date1.getDayOfWeek());
        //Получить дни недели
        //System.out.println(date2.isLeapYear());
        //Проверка на високосный год
        //System.out.println(date2.isAfter(dateNow));
        //System.out.println(date2.isBefore(dateNow));
        //Сравниваем стоит ли дата после другой даты
        //Или перед другой датой



       /* System.out.println("Input date: ");
        Scanner scanner = new Scanner(System.in);
        String  input = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(input);
        System.out.println(localDate.getDayOfWeek());
        */
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        //И дата, и время
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        //Привязка к дате

        LocalDate d = LocalDate.now();
        System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));


    }
}
