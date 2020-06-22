package com.java.brushup.oops.nestedInnerClass;

public class StaticClass {
    static class USB {
        int usb2 = 2;
        int usb3 = 1;

        int getTotalPorts() {
            return usb2 + usb3;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            StaticClass.USB usb = new StaticClass.USB();
            System.out.println("Total Ports: " + usb.getTotalPorts());
        }
    }
}
