package Courses.lesson14;

public class GenericExample <T1,T2> { //Любые классы
    private T1 value;
    private T2 secondValue;

    public void setValue(T1 value) {
        this.value = value;
    }

    public T1 getValue() {
        return value;
    }


}
