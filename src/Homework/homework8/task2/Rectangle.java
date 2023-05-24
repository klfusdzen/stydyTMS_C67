package Homework.homework8.task2;

public class Rectangle extends Shape{
    private double a, b;
    public Rectangle(double a1, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    double area() {
        return a * b;
    }

    @Override
    double perimeter() {
        return (a + b) * 2;
    }
}
