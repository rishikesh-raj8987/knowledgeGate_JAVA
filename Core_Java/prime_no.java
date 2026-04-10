package Core_Java;

import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {

        // take a input how many time you want to check prime and input which number you
        // want to check it is prime or not

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number how many time you want to check");
//        int t = scn.nextInt();
//        for (int i = 1; i <= t; i++) {
//            System.out.println("Enter the prime number:- ");
//            int n = scn.nextInt();
//
//            int count = 0;
//            for (int div = 1; div <= n; div++) {
//                if (n % div == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                System.out.println("Prime");
//            } else {
//                System.out.println("Not Prime");
//            }
//        }

         // best time complexsity
        int t = scn.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Enter the prime number:- ");
            int n = scn.nextInt();

            int count = 0;
            for (int div = 2; div*div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        System.out.println("Done");
    }
}
