package questions;

import java.util.Scanner;

public class Q3 {
    public static void main(String [] args){
        // take a integer input and print the absolute value of that integer
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number:-");
    int n = scn.nextInt();
    if(n>=0){
        System.out.println(n);
    } else{
        System.out.println(-n);
    }
}
}
