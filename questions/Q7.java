package questions;

import java.util.Scanner;

public class Q7 {
    public static void main(String[]  args ){
        //take a postive integer input and tell it is 4 digit number or not
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num= Scan.nextInt();
        if(num>999 && num<10000){
            System.out.println("The number is 4 digit number:- "+ num );
        }else {
            System.out.println("This is not a 4 digit number:- "+ num);
        }
    }
}
