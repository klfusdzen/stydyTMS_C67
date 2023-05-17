package Courses.lesson7;

public class Wolf extends Animal {
    //Правильно делать через code, override methods

    @Override //Аннотация
    void makeSound(int count) {
        System.out.println(count);
    }

    //Переопределение метода - теперь makeSound "из волка", поиск метода идет от дочернего к родительскому
    void makeSound(){
        System.out.println("Ouuuuuuuu");
    }
}
