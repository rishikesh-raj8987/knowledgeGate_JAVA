package Core_Java.loops1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //print the table of any number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to print table:- ");

        int num= scan.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println( num+" "+"* "+ i+ " "+ "= "+ num*i +" ");

        }
    }
}
