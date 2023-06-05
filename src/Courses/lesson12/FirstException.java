package Courses.lesson12;

public class FirstException extends RuntimeException{
    //RuntimeException непроверяемое исключение
    String info;

    public FirstException(String info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "Hello, this is my first exception! " + info;
    }
}
