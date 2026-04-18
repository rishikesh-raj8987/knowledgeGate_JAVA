package questions;

import java.util.Scanner;

public class Q2 {
    public static void main(String [] args){
        // Take positive integer input and tell if it is divisible by 5 or not
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want to check :- ");
        int n = scn.nextInt();
        if(n%5 == 0){
            System.out.println("The is divisible to 5");
        }
        else {
            System.out.println("the is not divisible");
        }
    }
}
