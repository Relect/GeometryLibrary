package org.example;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        System.out.println("Получаем площадь");
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Получаем периметр");
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
