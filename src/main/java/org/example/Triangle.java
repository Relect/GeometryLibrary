package org.example;

public class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a+b < c || a+c < b || b+c < a) {
            throw new Exception("Triangle does not exist, the sides are incorrectly");
        }
    }

    @Override
    public double getArea() {
        System.out.println("Получаем площадь");
        double p = getPerimeter() / 2;
        // формула Герона
        double s = Math.sqrt(p * (p-a)*(p-b)*(p-c));
        return s;
    }
    @Override
    public double getPerimeter() {
        System.out.println("Получаем периметр");
        return a+b+c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
