package Core_Java;

import java.util.Scanner;

public class _15_count_digits {

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = scn.nextInt();
        int count =0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println("Total digits:-  "+count);

    }

}
