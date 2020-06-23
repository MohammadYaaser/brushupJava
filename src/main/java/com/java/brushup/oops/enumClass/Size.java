package com.java.brushup.oops.enumClass;

enum Size {
    //SMALL,MEDIUM,LARGE, EXTRA_LARGE, DOUBLE_LARGE, DOUBLE_LARGE_EXTRA;

    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRA_LARGE("The size is extra large.");

    private final String pizzaSize;
    Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}

class Test {
    Size pizzaSize;

    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizzas() {
        switch (pizzaSize) {
            case LARGE:
                System.out.println("I Ordered a Large size pizza");
                break;
            case SMALL:
                System.out.println("I Ordered a small size pizza");
                break;
            case MEDIUM:
                System.out.println("I Ordered a medium size pizza");
                break;
            case EXTRA_LARGE:
                System.out.println("I Ordered a extra large size pizza");
                break;
            default:
                System.out.println("Unknown ordered size ");
        }
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Size.LARGE);
        System.out.println(Size.EXTRA_LARGE);

        Test test = new Test(Size.MEDIUM);
        test.orderPizzas();
    }
}
