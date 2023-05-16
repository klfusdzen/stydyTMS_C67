package Homework.homework6.task2;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.showColor();

        //Блин рефлексия
        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "White");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        apple.showColor();
    }
}
