package questions;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        // take 3 positive integer input and print the greater of them
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the first input: ");
        int num1 = sca.nextInt();
        System.out.println("Enter the Second  input: ");
        int num2 = sca.nextInt();
        System.out.println("Enter the Third input: ");
        int num3 = sca.nextInt();
        System.out.print("The greater number  :- ");
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }

    }
}
