package Courses.lesson12;

public class AgeException extends Exception{

    String info;

    public AgeException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Your access is closed! " + info;
    }

}
