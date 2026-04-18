package questions;

import java.util.Scanner;

public class Q4 {
    public static void main(String [] args){
        // take real number input and check if it is an integer or not
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the real number:- ");
        double n =scn.nextDouble();
        if(n%10 == 0){
            System.out.println("The number is integer");
        }
        else {
            System.out.println("The number is not an integer");
        }
    }
}
