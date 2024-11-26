package org.example;

public class Cube implements Shape3d {

    private final double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    @Override
    public double getArea() {
        return edge * edge * 6;
    }
}
