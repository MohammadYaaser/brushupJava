package com.java.brushup.oops.cloning;

public class DeepCloning implements Cloneable {
    String course1;
    String course2;
    String course3;

    public DeepCloning(String course1, String course2, String course3) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class DeepImplement implements Cloneable {
    int eduId;
    String learnerName;
    DeepCloning eduCourse;

    public DeepImplement(int eduId, String learnerName, DeepCloning eduCourse) {
        this.eduId = eduId;
        this.learnerName = learnerName;
        this.eduCourse = eduCourse;
    }

    //Overriding clone() method for creating a deep copy of an object
    protected Object clone() throws CloneNotSupportedException {
        DeepImplement learner = (DeepImplement) super.clone();
        learner.eduCourse = (DeepCloning) eduCourse.clone();
        return learner;
    }
}

class DeepCloneSample {
    public static void main(String[] args) {
        DeepCloning j2ee = new DeepCloning("Java", "Spring", "Microservices");
        DeepImplement learner1 = new DeepImplement(2811, "Max", j2ee);
        DeepImplement learner2 = null;

        try {
            //Creating a clone of learner1 and assigning it to learner2
            learner2 = (DeepImplement) learner1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Printing Details of Learner1
        System.out.println("Details of Learner 2: ");
        System.out.println("Id: "+learner1.eduId);
        System.out.println("Name: "+learner1.learnerName);
        System.out.println("Course Id: "+learner1.eduCourse);

        //Printing all the courses of 'learner1'
        System.out.println("Courses of Learner 1: ");
        System.out.println(learner1.eduCourse.course1);
        System.out.println(learner1.eduCourse.course2);
        System.out.println(learner1.eduCourse.course3);

        //Printing Details of Learner2
        System.out.println("Details of Learner 2: ");
        System.out.println("Id: "+learner2.eduId);
        System.out.println("Name: "+learner2.learnerName);
        System.out.println("Course Id: "+learner2.eduCourse);


        //Printing all the courses of 'learner2'
        System.out.println("Courses of Learner 2: ");
        System.out.println(learner2.eduCourse.course1);
        System.out.println(learner2.eduCourse.course2);
        System.out.println(learner2.eduCourse.course3);

        //Changing the course3 of 'learner2'
        learner2.eduCourse.course3 = "JSP";

        //This change won't be reflected in original 'learner1'
        System.out.println("Courses of Learner 1:");
        System.out.println(learner1.eduCourse.course1);
        System.out.println(learner1.eduCourse.course2);
        System.out.println(learner1.eduCourse.course3);

        //Updated Courses of learner2
        System.out.println("Courses of Learner 2:");
        System.out.println(learner2.eduCourse.course1);
        System.out.println(learner2.eduCourse.course2);
        System.out.println(learner2.eduCourse.course3);
    }
}
