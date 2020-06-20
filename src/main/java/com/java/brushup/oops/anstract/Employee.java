package com.java.brushup.oops.anstract;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee extends Person {

    private boolean employee;

    public Employee(int empId, String name, String gender, String email, String phone, String country, boolean working) {
        super(empId, name, gender, email, phone, country);
        this.employee = working;
    }


    @Override
    public void work() {
        if (employee) {
            System.out.println("Valid Employee");
        } else {
            System.out.println("Invalid Employee");
        }
    }


}