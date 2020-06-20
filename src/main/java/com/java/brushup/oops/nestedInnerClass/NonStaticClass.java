package com.java.brushup.oops.nestedInnerClass;

public class NonStaticClass {
    double price;
    class Processor {
        double cores;
        String manufacturer;
        double getCache() {
            return 4.3;
        }
    }
    protected class RAM {
        double memory;
        String manufacturer;
        double getClockSpeed() {
            return 5.5;
        }
    }
    public static class Main {
        public static void main(String[] args) {
            NonStaticClass cpu = new NonStaticClass();
            NonStaticClass.Processor processor = cpu.new Processor();
            NonStaticClass.RAM ram = cpu.new RAM();
            System.out.println("Processor Cache: " + processor.getCache());
            System.out.println("Ram Clock speed: " + ram.getClockSpeed());
        }
    }

}
