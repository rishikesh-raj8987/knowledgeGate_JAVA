package Core_Java.loops1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //print number form n to 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:- ");
        int n= sc.nextInt();

        for (int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
