package Homework.homework5;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
// Добавьте метод, который позволяет начислять сумму на кредитную карточку.
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
// Добавьте метод, который выводит текущую информацию о карточке.
// Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
// Выведите на экран текущее состояние всех трех карточек.

public class CreditCard {
    int accountNumber;
    double currentAmount;

    public CreditCard(int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    double plusMoney(double amount) {
        return this.currentAmount += amount;
    }

    double minusMoney(double amount) {
            return this.currentAmount -= amount;
    }

    void showInfo() {
        System.out.println("Аккаунт: " + this.accountNumber + "; Количество денег : " + this.currentAmount);
    }
}
