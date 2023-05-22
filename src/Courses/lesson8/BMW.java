package Courses.lesson8;

import java.lang.annotation.Annotation;

public class BMW implements FirstInterface, Cloneable , FirstFunctionalInterface{ // имплементируем интерфейс // позволяет копировать интерфейс
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println("BMW starts moving");
    }

    @Override
    public void stop() {
        System.out.println("BMW stops moving");
    }

    @Override
    public void signal() {
        System.out.println("BIP BIP");
    }

    @Override
    public void changeSpeed() {

    }

    @Override
    public void changeSpeed(int speed) {
        setSpeed(getSpeed() + speed);
    }

    @Override
    public int shouldBeOneMethod() {
        return 0;
    }

    @Override
    public void hello() {
        FirstFunctionalInterface.super.hello();
    }
}
