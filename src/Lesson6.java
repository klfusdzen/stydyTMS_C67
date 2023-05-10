public class Lesson6 {
    public static void main(String[] args) {
        //Создание из чертежа
        Kitty firstKitty = new Kitty();
        Kitty secondKitty = new Kitty();

        firstKitty.age = 5;
        firstKitty.breed = "Siam";
        firstKitty.name = "Kate";
        firstKitty.weight = 3;

        System.out.println(firstKitty.name);
    }
}
