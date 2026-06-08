package questions;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        //take positive interger input and tell if it is divisible by 5 or 3
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number :-  ");
        int num = sca.nextInt();

        if(num%3 ==0  || num %5==0){
            System.out.println("The given number is divisible");
        }else {
            System.out.println("not divisible");
        }
    }
}
