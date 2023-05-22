package Courses.lesson8;

public class Mac extends Computer{

    public Mac(int cost) {
        super(cost);
    }

    @Override
    void getClassName() {
        System.out.println("I’m Mac");
    }
}
