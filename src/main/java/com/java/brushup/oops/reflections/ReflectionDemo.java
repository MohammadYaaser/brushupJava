package com.java.brushup.oops.reflections;


interface Animal {
    public void display();
}

interface Mammal {
    public void display();
}

class Dog implements Animal, Mammal {
    @Override
    public void display() {
        System.out.println("Iam a Dog");
    }

    public void makeSound() {
        System.out.println("Bark bark");
    }
}

public class ReflectionDemo {


    public static void main(String[] args) {
        try {
            Dog dog = new Dog();

            Class obj = dog.getClass();

            Class[] objectInsterface = obj.getInterfaces();

            for (Class c : objectInsterface) {
                System.out.println("Interface Name: " + c.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
