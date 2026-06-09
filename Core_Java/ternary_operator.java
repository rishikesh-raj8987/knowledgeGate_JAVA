package Core_Java;

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        
//    int n1=10 , n2 =20 ,max;
//    max = (n1>n2)? n1:n2;
//    System.out.println("maximum is = " + max);
//


    // check the given number is even or odd  by using teenary operator
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = scn.nextInt();
        System.out.println((num%2==0)?"even":"odd");
    }
    
}
