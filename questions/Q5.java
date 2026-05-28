package questions;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        // You need to perform three separate tasks based on the given input:
        //
        // String Input and Print: Read a string s (which may contain spaces) and print
        // it as it is.
        // Integer Input and Print: Read an integer n and print it without any change.
        // Float Input and floor Print: Read a floating-point number as input, take its
        // floor value, and print as an integer.
        Scanner sc = new Scanner(System.in);

        String s;
        int n;
        float f;
        int ff; // To store floor value

        // Input
        s = sc.nextLine();
        n = sc.nextInt();
        f = sc.nextFloat();

        // Floor conversion
        ff = (int) Math.floor(f);

        // Output
        System.out.println(s);
        System.out.println(n);
        System.out.println(ff);
    }
}
