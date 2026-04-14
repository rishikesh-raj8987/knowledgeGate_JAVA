package Core_Java;

import java.util.Scanner;

public class conditions02 {
    public static void main(String [] args){
        //WAP to check the marks of the student
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the mark of Student:- ");
        int marks = sc.nextInt();
        if(marks>90){                   
            System.out.println("Excellent");
        } else if (marks>80 && marks <= 90) {
            System.out.println("Good");
        } else if (marks>70 && marks <=80) {
            System.out.println("fair");
        } else if (marks>60 && marks <= 70) {
            System.out.println("Meets expectations");
        }else{
            System.out.println("below par");
        }

    }
}
