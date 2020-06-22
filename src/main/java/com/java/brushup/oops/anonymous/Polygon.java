package com.java.brushup.oops.anonymous;

class Polygon {
    public void display() {
        System.out.println("Inside the polygon class");
    }
}

interface PolygonInterface {
    void display();
}

class Anonymous {
    public void createClass() {
        Polygon polygon = new Polygon() {
            public void display() {
                System.out.println("Inside Anonymous class");
            }
        };
        polygon.display();
    }

    public void createClassIn(){
        PolygonInterface polygonInterface = new PolygonInterface() {
            @Override
            public void display() {
                System.out.println("Inside Anonymous Interface override");
            }
        };
        polygonInterface.display();

//        Using lambda expression
        PolygonInterface polygonInterfaceLambda = () -> {
            System.out.println("Inside Anonymous Interface override" +
                    " using Lambda");
            System.out.println("Multiple lines inside lambda");
        };
        polygonInterfaceLambda.display();
    }

}

class Main {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.createClass();

        anonymous.createClassIn();
    }
}
