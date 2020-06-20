package com.java.brushup.oops.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cat extends Animal {
    private String color;

    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = "White";
    }

    public Cat(boolean vegetarian, String eats, int noOfLogs, String color) {
        super(vegetarian, eats, noOfLogs);
        this.color = color;
    }

}
