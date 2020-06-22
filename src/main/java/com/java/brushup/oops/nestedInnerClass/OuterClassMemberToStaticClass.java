package com.java.brushup.oops.nestedInnerClass;

class OuterClassMemberToStaticClass {
    String model;

    public OuterClassMemberToStaticClass(String model) {
        this.model = model;
    }

    static class USB {
        int usb2 = 2;
        int usb3 = 1;

        int getTotalParts() {
            //error: non-static variable this cannot be referenced from a static context
//            if (OuterClassMemberToStaticClass.this.model.equals("MSI")) {
//                return 4;
//            }
            return usb2 + usb3;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            OuterClassMemberToStaticClass.USB usb = new OuterClassMemberToStaticClass.USB();
            System.out.println("Total Ports: " + usb.getTotalParts());
        }
    }
}
