package Homework.homework7;

public class Animal {
    private String meat = "Meat";
    private String grass = "Grass";

    public String getMeat() {
        return meat;
    }

    public String getGrass() {
        return grass;
    }

    void voice(){
        System.out.println("Voice");
    }
    public void eat(String food){
        System.out.println("Im eat something");
    }
}
