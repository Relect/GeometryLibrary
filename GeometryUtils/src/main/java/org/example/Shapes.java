package org.example;

import java.util.Arrays;

public class Shapes {

    public static boolean compareShape(Shape shape1, Shape shape2) {
        Class<?> class1 = shape1.getClass();
        Class<?> class2 = shape2.getClass();
        if (class1.equals(Circle.class) && class2.equals(Circle.class)) {
            return ((Circle) shape1).getRadius() == ((Circle) shape2).getRadius();
        } else if (class1.equals(Rectangle.class) && class2.equals(Rectangle.class)) {
            Rectangle rectangle1 = (Rectangle) shape1;
            Rectangle rectangle2 = (Rectangle) shape2;
            if (rectangle1.getHeight() == rectangle2.getHeight()) {
                return rectangle1.getWidth() == rectangle2.getWidth();
            } else if (rectangle1.getHeight() == rectangle2.getWidth()) {
                return rectangle1.getWidth() == rectangle2.getHeight();
            } else {
                return false;
            }
        } else if (class1.equals(Triangle.class) && class2.equals(Triangle.class)) {
            Triangle triangle1 = (Triangle) shape1;
            Triangle triangle2 = (Triangle) shape2;
            double[] arr1 = new double[]{triangle1.getA(), triangle1.getB(), triangle1.getC()};
            double[] arr2 = new double[]{triangle2.getA(), triangle2.getB(), triangle2.getC()};
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static double toCubicCentimeter(double meters) {
        return meters * 1000;
    }

    
}
