package Courses.lesson8;

public class BMW implements FirstInterface, Cloneable { // имплементируем интерфейс // позволяет копировать интерфейс
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

}
