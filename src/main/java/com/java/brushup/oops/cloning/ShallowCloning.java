package com.java.brushup.oops.cloning;

class ShallowCloning {
    String course1;
    String course2;
    String course3;

    public ShallowCloning(String course1, String course2, String course3) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
}

class ShallowImplement implements Cloneable {
    int eduId;
    String learnerName;
    ShallowCloning shallowCloning;

    public ShallowImplement(int eduId, String learnerName, ShallowCloning shallowCloning) {
        this.eduId = eduId;
        this.learnerName = learnerName;
        this.shallowCloning = shallowCloning;
    }

    //Default version of clone() method

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Main {
    public static void main(String[] args) {
        ShallowCloning j2ee = new ShallowCloning("Java", "Spring", "Microservices");

        ShallowImplement learner1 = new ShallowImplement(2881, "Max", j2ee);

        ShallowImplement learner2 = null;

        try {
            learner2 = (ShallowImplement) learner1.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Printing Details of Learner1
        System.out.println("Details of Learner 2: ");
        System.out.println("Id: " + learner1.eduId);
        System.out.println("Name: " + learner1.learnerName);
        System.out.println("Course Id: " + learner1.shallowCloning);

        //Printing all the course of learner1
        System.out.println("Course of Learner1: ");
        System.out.println(learner1.shallowCloning.course1);
        System.out.println(learner1.shallowCloning.course2);
        System.out.println(learner1.shallowCloning.course3);

        //Printing all the courses of 'learner2'
        System.out.println("Course of Learner 2: ");
        System.out.println(learner2.shallowCloning.course1);
        System.out.println(learner2.shallowCloning.course2);
        System.out.println(learner2.shallowCloning.course3);


        //Changing the course of 'learner2'
        learner2.shallowCloning.course3 = "JSP";

        //This change will be reflected in original 'learner1'
        System.out.println("Updated Course of Learner 2:");
        System.out.println(learner1.shallowCloning.course1);
        System.out.println(learner1.shallowCloning.course2);
        System.out.println(learner1.shallowCloning.course3);

    }
}
