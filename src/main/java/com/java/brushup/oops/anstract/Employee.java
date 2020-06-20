package com.java.brushup.oops.anstract;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee extends Person {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(100);
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
