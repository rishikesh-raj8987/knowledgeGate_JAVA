package questions;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        // Take integer input and check whether its magnitude is smaller than 69 or not
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the integer value: ");
        int num = scan.nextInt();

        if (num < 0) {
            num = -num;
        }

        if (num < 69) {
            System.out.println("The integer is smaller");
        } else {
            System.out.println("The integer is not smaller");
        }
    }
}