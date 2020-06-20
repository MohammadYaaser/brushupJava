package com.java.brushup.oops.abstracts;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public abstract class Person {
    private int empId;
    String name;
    String gender;
    String email;
    String phone;
    String country;

    public void setName(String name) {
        this.name = name;
    }

    //abstract method
    public abstract void work();
}
