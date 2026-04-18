package Core_Java;

import java.util.Scanner;

public class _20_reverse_Of_number {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = scn.nextInt();

        while(n!=0){
            int dig =n%10;
             n= n/10;5+
            System.out.print(dig);
        }

    }
}
