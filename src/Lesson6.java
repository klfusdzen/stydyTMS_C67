//Создать объект класса Calculator в main методе другого класса.
// Проверить работу методов, и вывести в консоль значения полей weight, cost, color.

public class Lesson6 {
    /* public static void main(String[] args) {
        //Создание из чертежа
        Kitty firstKitty = new Kitty("Kate", 5);
        Kitty secondKitty = new Kitty("Soap","Clone", 1, 5);

        secondKitty.makeVoice();
        firstKitty.giveMeAgePlusOneYear();
        firstKitty.printAgePlusOneYear();

        //Можно и так
        int result = firstKitty.giveMeAgePlusOneYear();
        System.out.println(result);
    } */

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5.3, 40, "Blue");
        System.out.println(calculator.findSum(5, 5));
        //Или можно так: long result = calculator.findSum(5, 5) - найдет сумму, а затем запишет в переменную result
        System.out.println(calculator.findDel(10,3));

        //Выводим в консоль значения полей
        System.out.println(calculator.color);
    }
}
