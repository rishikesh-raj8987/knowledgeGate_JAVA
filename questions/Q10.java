package questions;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // take 3 positive integer input and tell if they can be the sides of a triangle or not
        Scanner scn =  new Scanner(System.in);

        System.out.println("Enter the first side of triangle:- ");
        int a = scn.nextInt();
        System.out.println("Enter the second side of triangle:- ");
        int b = scn.nextInt();
        System.out.println("Enter the third side of triangle:- ");
        int c = scn.nextInt();

        if(a+b>c || b+c>a || c+a>b){
            System.out.println("The sides are the triangle");
        }
        else{
        System.out.println("The sides are not the triangle");
             }
    }
}
