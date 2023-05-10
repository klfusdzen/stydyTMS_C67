

public class Kitty {
    //Класс мы называем так, как хотим описать обьект
    //Состояние (характеристики): цвет
    //Поведение (что может): бегать, мяукать, ходить
    String name;
    String breed;
    int age;
    int weight;

    public Kitty() {
        //Конструктор
        System.out.println("We creation kitty!");
    }

    public Kitty(int a) {
        age = a;
    }

    public Kitty(String name, int age) {
        this.name = name;
        this.age = age;
        //this - ссылка на класс в котором выполняется операция (он видит name в Kitty и записывает туда имя)
    }
}
