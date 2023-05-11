//Создать класс CreditCard c полями номер счета,
// текущая сумма на счету. Добавьте метод, который позволяет начислять сумму на кредитную карточку.
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
// Добавьте метод, который выводит текущую информацию о карточке.
// Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
// Выведите на экран текущее состояние всех трех карточек.

public class CreditCard {
    int money = 100;
    String showMoney = "Баланс";

    public CreditCard() {
        System.out.println("Ваша карта по нулям");
    }

    public CreditCard(int money, String showMoney) {
        this.money = money;
        this.showMoney = showMoney;
    }

    long plusMoney(int a, int balance) {
        return a + balance;
    }

    int minusMoney(int a, int balance) {
        return balance - a;
    }

    void showBalance() {
        System.out.println("На балансе: ");
    }
}
