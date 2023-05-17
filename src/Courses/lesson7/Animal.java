package Courses.lesson7;

public class Animal {
    //Полиморфизм - перегрузка и переопределение (один интерфейс, множество реализаций)
    //Спецификация метода - makeSound(String sound) - название и параметры

    //Перегрузка метода - одно имя и множество использования
    //Переопределение метода - возможность дочернему классу обеспечивать специфическую реализацию метода
    //Отличаются друг от друга тем, что переопределение только с одинаковыми параметрами, иначе это перегрузка

    void makeSound(){
        System.out.println("empty");
    }

    void makeSound(String sound){
        System.out.println("With string line: " + sound);
    }

    void makeSound(int count){
        System.out.println("With another type: " + count);
    }
}
