package Homework.homework7.task1;

public class Animal {
    private String meat = "Meat";
    private String grass = "Grass";

    public String getMeat() {
        return meat;
    }

    public String getGrass() {
        return grass;
    }

    public void voice(){
        System.out.println("Voice");

    }
    public void eat(String food){
        System.out.println("Im eat something");
    }

}
