package Homework.homework5;

import java.util.Scanner;
//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
// Добавьте метод, который позволяет начислять сумму на кредитную карточку.
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
// Добавьте метод, который выводит текущую информацию о карточке.
// Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
// Выведите на экран текущее состояние всех трех карточек.

public class Main {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard(345678,20);
        CreditCard creditCard2 = new CreditCard(234567,30);
        CreditCard creditCard3 = new CreditCard(123456,40);

        double result1 = creditCard1.plusMoney(20);
        double result2 = creditCard2.plusMoney(30);
        double result3 = creditCard3.plusMoney(40);

        creditCard1.showInfo();
        creditCard2.showInfo();
        creditCard3.showInfo();
    }
}