package Homework.homework12.task1;

public class WrongLoginException extends Exception {
    String info;

    public WrongLoginException() {
    }

    public WrongLoginException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "info='" + info + '\'' +
                '}';
    }
}
