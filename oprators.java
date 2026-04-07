// package Core_Java;

import java.util.Scanner;

public class oprators {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b =sc.nextInt();
        int ADD = a+b;
        int mul = a*b;
        float div =a/b;
        float mod = a%b;
        int a++;
        int b++;
        System.out.println("ADD =" + ADD);
        System.out.println("Multiply = "+ mul);
        System.out.println("div = "+ div);
        System.out.println("mod = "+mod);



    }
}
