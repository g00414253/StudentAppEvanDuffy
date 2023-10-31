package ie.StudentApp.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
        //Student that is filled using default constructor
        Student s1 = new Student();

        //Student created using Parameterized constructor
        Student s2 = new Student("John","Doe","Maths","G00142235");
    */

        //Student created using a constructor
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.getInfo();
        s2.getInfo();
        s3.getInfo();

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();


    }
}