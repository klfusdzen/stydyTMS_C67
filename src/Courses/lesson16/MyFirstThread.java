package Courses.lesson16;

public class MyFirstThread extends Thread {

    @Override
    public void run (){
        for (int i = 0; i < 100;i++){
            System.out.println(i);
        }
    }
}
