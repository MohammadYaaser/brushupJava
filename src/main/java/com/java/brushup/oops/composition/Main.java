package com.java.brushup.oops.composition;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        //  Notice that above test program for composition in java
        // is not affected by any change in the Job object.
        // If you are looking for code reuse and the relationship
        // between two classes is has-a then you should use composition rather than inheritance.
        // Benefit of using composition in java is that we can control the visibility of
        // other object to client classes and reuse only what we need.

        System.out.println("Salary: " + salary);
    }
}
