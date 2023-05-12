package Courses.lesson5;
//Создать класс Courses.lesson6.Calculator с полями weight, cost, color и заполнить их.
// И методами нахождения суммы, разности, деления, умножения двух чисел.
// Метод main в этом классе не создавать
//Создать конструктор для класса Courses.lesson6.Calculator чтобы иметь возможность инициализировать поля в момент создания объекта.
// Так-же в логическом блоке добавить вывод в консоль что создаётся объект Courses.lesson6.Calculator.

//Иерархия: 1 - поля, 2 - конструкции, 3 - методы

public class Calculator {
    double weigth = 10.5;
    int cost = 100;
    String color = "Black";

    static {
        //Статический блок, который будет выполняться самым первым
        System.out.println("Это статический логический блок");
    }

    {
        //Логический блок {}
        //Тут будут выполняться действия до конструктора (разные блоки идут друг за другом)
        color = "red";
        System.out.println("Мы создаем калькулятор");
    }

    public Calculator(double weigth, int cost, String color) {
        //У конструктора нет возвращаемого значения
        //Название такое же как у класса
        this.weigth = weigth;
        this.cost = cost;
        this.color = color;
    }

    long findSum(int a, int b) {
        return a + b;
    }

    int findRaz(int a, int b) {
        return a - b;
    }

    double findDel(int a, int b) {
        return (double) a / b;
    }

    long findMult(int a, int b) {
        return a * b;
    }
}
