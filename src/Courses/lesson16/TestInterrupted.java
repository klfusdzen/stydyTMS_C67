package Courses.lesson16;

public class TestInterrupted  extends Thread{
    @Override
    public  void run (){
        while (!isInterrupted()){
            System.out.println("Thread is working");
            try {
                sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
                interrupt();
            }
        }
        System.out.println("Thread is closed");
    }
}
