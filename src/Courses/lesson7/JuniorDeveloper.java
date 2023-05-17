package Courses.lesson7;

public class JuniorDeveloper extends Developer {
    public JuniorDeveloper(){
        System.out.println("Im working too");
    }
    {
        System.out.println("Hello from logic block");
    }

    static {
        System.out.println("Static block from Junior");
    }
    //Статический блок отрабатывает только один раз при первой инициализации
    //Сначала отрабатываются статические блоки, потом логические и даллее конструктор
}
