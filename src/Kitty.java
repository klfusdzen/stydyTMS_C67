

public class Kitty {
    //Класс мы называем так, как хотим описать обьект
    //Состояние - конструктор (характеристики): цвет
    String name;
    String breed;
    int age;
    int weight;

    public Kitty() {
        //Конструктор по умолчанию
        System.out.println("We creation kitty!");
    }

    public Kitty(int a) {
        //Пользовательский конструктор
        age = a;
    }

    public Kitty(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        //Code -> Generate -> Constructor
    }

    public Kitty(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //this - ссылка на класс в котором выполняется операция (он видит name в Kitty и записывает туда имя)

    //Поведение - метод (что может): бегать, мяукать, ходить (с маленькой буквы)
    //Что метод отдает как результат
    //Имя
    //Тело метода

    void makeVoice() {
        //Void - ничего не надо записывать, просто распечатай
        System.out.println("Meow meow!");
    }
    int giveMeAgePlusOneYear(){
        //Вместо Void нам надо указать тип того, что хотим получать
        //return - прописываем, что хотим что-то вернуть
        return age += 1;
    }
    void printAgePlusOneYear(){
        System.out.println(age + 1);
    }
}
