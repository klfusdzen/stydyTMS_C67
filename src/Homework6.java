//Создать класс CreditCard c полями номер счета,
// текущая сумма на счету. Добавьте метод, который позволяет начислять сумму на кредитную карточку.
// Добавьте метод, который позволяет снимать с карточки некоторую сумму.
// Добавьте метод, который выводит текущую информацию о карточке.
// Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
// Выведите на экран текущее состояние всех трех карточек.
import java.util.Scanner;


public class Homework6 {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(50, "На балансе первой карты 50");
        CreditCard creditCard2 = new CreditCard(30, "На балансе второй карты 30");
        CreditCard creditCard3 = new CreditCard(1200, "На балансе третьей карты 1200");

        System.out.println("Какую сумму положить на первую карту?");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Какую сумму положить на вторую карту?");
        int b = scanner.nextInt();
        System.out.println("Какую сумму снять с третьей карты?");
        int c = scanner.nextInt();
        int balance1 = creditCard1.money;
        int balance2 = creditCard2.money;
        int balance3 = creditCard3.money;

        System.out.println(creditCard1.plusMoney(a,balance1));
        System.out.println(creditCard2.plusMoney(b, balance2));
        System.out.println(creditCard3.minusMoney(c, balance3));

        System.out.println(creditCard1.showMoney);
        System.out.println(creditCard2.showMoney);
        System.out.println(creditCard3.showMoney);
    }
}
