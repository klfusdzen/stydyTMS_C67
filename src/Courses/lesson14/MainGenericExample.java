package Courses.lesson14;

public class MainGenericExample {
    public static void main(String[] args) {
        System.out.println(hashSumm(15,16));
    }

    GenericExample<Integer, String> example1 = new GenericExample<>();
    GenericExample<String, Double> example2 = new GenericExample<>();

    static <T> Integer hashSumm(T... objects) {
        int summ = 0;
        for (T o : objects) {
            summ = summ + o.hashCode();
        }
        return summ;
    }
}
