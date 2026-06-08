package questions;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num = scn.nextInt();

        if(num%5==0 && num%3==0){
                System.out.println("Apurva");
        } else if (num%5==0) {
            System.out.println("Riya");
        } else if (num%3==0) {
            System.out.println("Banu");
        }else {
            System.out.println("Isha");
        }
    }
}
