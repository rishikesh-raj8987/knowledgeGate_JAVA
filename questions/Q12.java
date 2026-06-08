package questions;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        // Take length and breadth of rectangle as input and write a program to find whether the area of rectangle is greater than its perimerter
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:- ");
        float len = scn.nextFloat();
        System.out.println("Enter the breadth of the rectangle:- ");
        float bre = scn.nextFloat();

        float area = len * bre;
        float perimeter = 2 *(len+bre);
        System.out.println("area = " + area + " "+ "perimeter "+ perimeter );
        if( area == perimeter ){
            System.out.println("both are equal");
        }else if(area>perimeter){
            System.out.println("Area is greater");
        }else {
            System.out.println("Perimeter is greater");
        }

    }
}
