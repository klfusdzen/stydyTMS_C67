package Courses.lesson6;

public class House {
    double cost = 100;

    //добавить рандомное число
    double getCostPlus(){
        double randomValue = Math.random();
        this.cost = cost + randomValue;
        return randomValue;
    }
}