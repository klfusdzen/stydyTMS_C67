package Courses.lesson8;

public interface FirstInterface {
    //Интерфейс - список методов, которые должны быть реализованы в классе
    //Который имплиментирует интерфейс
    //Все методы public

    //Все поля по умолчанию public final static, строка внизу - поле
    int WHEELS_COUNT = 4;

    //Интерфейс может наследоваться, возможно множественное нследование (только в интерфейсах!)

    //default - "я хочу описать этот метод" -
    default void start() {
        System.out.println("Some sound");
    }

    //в 11 java добавили приватные интерфейсы
    private void privatMethod() {
        System.out.println("This is static method");
        //Может использовться в дефолт блоке
    }

    ;

    void stop();

    void signal();

    void changeSpeed();

    void changeSpeed(int speed);
}
