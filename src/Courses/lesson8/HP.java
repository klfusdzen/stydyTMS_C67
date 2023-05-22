package Courses.lesson8;

public class HP extends Computer{

    public HP(int cost) {
        super(cost);
    }

    @Override
    void getClassName() {
        System.out.println("I’m HP");
    }
}
