package Core_Java;

import java.util.Scanner;

public class _14_fibonacciNumber {
    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many fibonacci you want to print:- ");
        int n = scn.nextInt();
        int f1 =0;
        int f2 = 1;
          for(int i =0;i<=n;i++){
              System.out.println(f1);
              int a = f1 + f2;
              f1= f2 ;
              f2 = a;
          }
    }
}
