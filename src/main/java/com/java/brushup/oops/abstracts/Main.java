package com.java.brushup.oops.abstracts;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(100);

    public static void main(String[] args) {
        Person student = new Employee(ID_GENERATOR.getAndIncrement(), "Mohammad Yaseer", "Male", "mohammadyaseer@icloud.com",
                "9731878897", "India", false);
        student.work();
        student.setName("Yaseer Hussain");

        System.out.println(student.toString());

        Person teacher = new Employee(ID_GENERATOR.getAndIncrement(), "Johny Depp", "Male", "Johny.depp@icloud.com"
                , "No Set", "USA", true);

        teacher.work();
        teacher.setName("Captain Jack Sparrow");
        System.out.println(teacher.toString());

    }
}
