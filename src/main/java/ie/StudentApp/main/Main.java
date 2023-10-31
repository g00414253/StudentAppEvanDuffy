package ie.StudentApp.main;

 public class Student{

    // Student Info
    String firstName,lastName;
    long Course,email;

//Constructor
     public Student(String firstName,String lastName,long Course,long email){
         this.firstName=firstName;
         this.lastName=lastName;
         this.Course=Course;
         this.email=email;
     }

     //Default Constructor
     public Student(){
         this.firstName=Evan;
         this.lastName=Duffy;
         this.Course=Software;
         this.email=g00414253;
     }



public void displayInfo(){
    System.out.println("Name: " + firstName "" + lastName ", Email: " + email ", Course: " + Course);
}


}


public class Main {
}