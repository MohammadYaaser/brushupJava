package com.java.brushup.oops.inheritance;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(false, "Milk", 4, "Black");

        System.out.println("Cat is Vegetarian? " + cat.isVegetarian());
        System.out.println("Cat eats: " + cat.getEats());
        System.out.println("Cat has: " + cat.getNoOfLogs());
        System.out.println("Cat color is: " + cat.getColor());

        Cat cat2 = new Cat(false, "Milk", 4);

        System.out.println("Cat is Vegetarian? " + cat2.isVegetarian());
        System.out.println("Cat eats: " + cat2.getEats());
        System.out.println("Cat has: " + cat2.getNoOfLogs());
        System.out.println("Cat color is: " + cat2.getColor());

    }
}
