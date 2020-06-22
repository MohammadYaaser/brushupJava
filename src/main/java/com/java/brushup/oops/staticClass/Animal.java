package com.java.brushup.oops.staticClass;

public class Animal {
    class Reptile {
        public void displayInfo() {
            System.out.println("Iam a reptile");
        }
    }

    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal");
        }
    }

    static class Main{
        public static void main(String[] args) {
            Animal animal = new Animal();

            Animal.Reptile reptile = animal.new Reptile();
            reptile.displayInfo();

            Animal.Mammal mammal = new Animal.Mammal();
            mammal.displayInfo();
        }
    }
}
