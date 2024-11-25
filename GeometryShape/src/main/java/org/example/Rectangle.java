package org.example;

public class Rectangle implements Shape {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        System.out.println("Получаем площадь");
        return height * width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Получаем периметр");
        return 2 * (height + width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
