package com.java.brushup.oops.runnableInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("From Main()" + Thread.currentThread().getName());
        System.out.println("Creating Runnable Interface...");

        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("From run(): " + Thread.currentThread().getName());
            }
        };*/

        Runnable runnable = () -> System.out.println("From run(): " + Thread.currentThread().getName());

        System.out.println("Creating a Thread Instances...");

        Thread thread = new Thread(runnable);

        System.out.println("Launching a Thread..");
        thread.start();
    }
}
