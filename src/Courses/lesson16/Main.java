package Courses.lesson16;

import Homework.homework6.task1.Therapist;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //MyFirstThread mft = new MyFirstThread();
        //mft.start();
        //System.out.println(mft.isAlive());
        //mft.interrupt();
        //Переводит поле в true, но не останаваливает поток
        //mft.isInterrupted();
        //Смотрит false или true
        //Мало используемые

        //TestInterrupted it = new TestInterrupted();

        //it.start();
        //Thread.sleep(100);
        //it.interrupt();

        //Потоки демоны- потоки, завершение которых не дожидается программа

        //MyFirstThread thread = new MyFirstThread();
        //thread.setDaemon(true);

        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            Thread counterThread = new Thread(new CounterThread(counter));
            counterThread.start();
        }

        /*Thread thread1 = new Thread(new CounterThread(counter1));
        Thread thread2 = new Thread(new CounterThread(counter1));
        Thread thread3 = new Thread(new CounterThread(counter1));
        Thread thread4 = new Thread(new CounterThread(counter1));
        Thread thread5 = new Thread(new CounterThread(counter1));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        */

    }
}
