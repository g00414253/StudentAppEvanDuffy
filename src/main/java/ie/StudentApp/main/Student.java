package ie.StudentApp.main;

import java.util.Scanner;

public class Student{

    // Student Info
    String firstName,lastName;
    String Course,email;

    //Constructor
    public Student(String firstName,String lastName,String Course,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.Course=Course;
        this.email=email;
    }

    //Default Constructor
    public Student(){
        this.firstName="Evan";
        this.lastName="Duffy";
        this.Course= "Software";
        this.email="g00414253";
    }

    //Function to collect info
    public void getInfo(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName=scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName=scanner.nextLine();

        System.out.println("Enter course name: ");
        this.Course=scanner.nextLine();

        System.out.println("Enter email: ");
        this.email=scanner.nextLine();

    }

    //Function to display info
    public void displayInfo(){
        System.out.println("Name: " + firstName + " " + lastName + ", Email: " + email + ", Course: " + Course);
    }


}
