public class Lesson2 {
    /* public static void main(String[] args) {
        // предыдущая версия свича
        int a = 7;
        switch (a) {
            case 1:
                System.out.println("One");
                break; // завершить работу ( мы нашли значение)
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Fault");
        }
    } */

    /* public static void main(String[] args) {
        // новая версия свича
        int number = 1;
        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            default -> System.out.println("Fault");
        }
    } */
    public static void main(String[] args) {
        // Cmd + D дублирование строки
        /* System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        int x = 1;
        while (x <= 25) {//условие true или false
            System.out.print(x++ +" ");
        }
        System.out.println("The end");
    } */
    /*    int a = 1;
        do {
            System.out.println(a++); //сначала выполни, потом проверь, нужно ли выполнить 2 раз
        } while (a <= 5);
    } */
        // 1. обьявлять переменные, которые будут использоваться только в цикле for
        // 2. условие
        // 3. действие после каждой итерации

        /* for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
    } */
        for (int i = 0 ; i < 10; i++) {
                System.out.print(i + " ");
                if (i == 5) {
                    break; //выходит из цикла
                    //continue; //перейти на следущую итерацию
                    //return; //выйти из метода
                }
            }
            System.out.println("End ...");
        }
}
