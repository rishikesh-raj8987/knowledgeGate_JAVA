package Core_Java.loops1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        //Count digits of a number
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want to check := ");
        int num = scn.nextInt();
        int count = 0;
        while (num != 0) {
            num = num/10;
            count++;
        }
        System.out.println("Total digit:="+ count);
    }
}
