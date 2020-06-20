package com.java.brushup.oops.interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape{
    private double width;
    private double height;

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
