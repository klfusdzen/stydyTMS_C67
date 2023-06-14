package Courses.lesson14;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class MainGenericExample {
    public static void main(String[] args) {
        System.out.println(hashSumm(15,16));

        //FIFO
        /*PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("First");
        queue.add("Second");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add("Third");
        System.out.println(queue);*/

        //LIFO
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println(queue);
        queue.removeLast();
        System.out.println(queue);


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
