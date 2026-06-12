package Core_Java.loops1;

import java.util.Scanner;

public class Q6_1 {
    public static void main(String[] args) {
        //take 'n' as input from user and print the following sequence..
//            1     n     2      n-1     3       n-2
//                1   10      2       9       3       8       4       4       7

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n := ");
        int n = scn.nextInt();
        for (int i =1;i<=n;i++){
            System.out.println(i);
            System.out.println(n--);
        }
    }
}
