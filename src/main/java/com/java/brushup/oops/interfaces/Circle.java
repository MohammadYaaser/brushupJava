package com.java.brushup.oops.interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {
    private double radius;

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

}
