package com.java.brushup.oops.nestedInnerClass;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OuterClassMemberToInner {
    String carName;
    String carType;

    public String getCarNamespace() {
        return carName;
    }

    class Engine {
        String engineType;

        void setEngineType() {
            if (OuterClassMemberToInner.this.carType.equals("4WD")) {
                if (OuterClassMemberToInner.this.carName.equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }
            } else {
                this.engineType = "Bigger";
            }
        }

        String getEngineType() {
            return this.engineType;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            OuterClassMemberToInner car = new OuterClassMemberToInner("Mazda", "8WD");
            OuterClassMemberToInner.Engine engine = car.new Engine();
            engine.setEngineType();
            System.out.println("Engine Type for 8WD= " + engine.getEngineType());

            OuterClassMemberToInner car2 = new OuterClassMemberToInner("Crysler", "4WD");
            OuterClassMemberToInner.Engine engine1 = car2.new Engine();
            engine1.setEngineType();
            System.out.println("Engine Type for 4WD= " + engine1.getEngineType());
        }
    }
}
