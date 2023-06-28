package Courses.lesson16;

public class CounterThread implements Runnable {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            //Кто первый добирается до монитора, тот и работает
            counter.setCounter(1);
            for (int i = 0; i < 4; i++) {
                System.out.println(counter.getCounter());
                counter.increase();
            }
        }
    }
}
