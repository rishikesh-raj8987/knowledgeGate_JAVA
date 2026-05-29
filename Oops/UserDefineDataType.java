package Oops;

public class UserDefineDataType {
    public static class Student{ // khud ka data type bana liye hai /// class
        String name;
        int rno;
        double cgpa;
    }
    public static void main (String [] args){   // object
        Student s1 = new Student(); //declaration
        s1.name = "Rishi";
        s1.rno = 34 ;
        s1.cgpa = 7.9;

        Student s2 = new Student(); //declaration
        s2.name = "Mohan";
        s2.rno = 29 ;
        s2.cgpa = 5.6;

        Student s3 = new Student(); //declaration
        s3.name = "Rohit";
        s3.rno = 77 ;
        s3.cgpa = 6.5;
    }

}
