package questions;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        //take interger input and check it's magnitude is smaller than 69 or not
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer value:- ");
        int num = scan.nextInt();
        if(num>0){
            if(num>69){
                System.out.println("The integer is not smaller ");
            }else {
                System.out.println("The integer is smaller");
            }
        }else{
            num= -num;
            if(num>69){
                System.out.println("The integer is not smaller ");
            }else {
                System.out.println("The integer is smaller");
            }
        }
    }
}
