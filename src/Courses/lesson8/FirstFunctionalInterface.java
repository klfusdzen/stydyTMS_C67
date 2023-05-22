package Courses.lesson8;

@FunctionalInterface
//Эта анотация гарантирует, что метод будет только один
public interface FirstFunctionalInterface {
    //Один абстрактный метод - интерфейс называется функцинальным
    int shouldBeOneMethod();

    //Главное, чтоб был один абстрактный метод, default может быть сколько угодно
    default void hello(){
        System.out.println("Default realisation");
    }
}
