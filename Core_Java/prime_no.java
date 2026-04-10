package Core_Java;

import java.util.Scanner;

public class prime_no {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the number how many time you want to check");
        int t = scn.nextInt();
        for (int i=1;i<=t;i++){
            System.out.println("Enter the prime number:- ");
            int n = scn.nextInt();
            if(n%n==0 || n%1==0){
                System.out.println("This number is prime number");
            }else {
                System.out.println("This is not a prime number");
            }
        }
        System.out.println("Done");
    }
}
