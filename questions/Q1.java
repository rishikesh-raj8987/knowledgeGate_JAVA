package questions;

import java.util.Scanner;

public class Q1 {
    public static void main(String [] args){
        // take positive integer input and tell if it is odd or even
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number you want to check:- ");
        int num = scn.nextInt();
        if(num>0){
            if(num%2 == 0)
                System.out.println("Even " + num );
            else
            {
                System.out.println("Odd");
            }

        }
    }
}
